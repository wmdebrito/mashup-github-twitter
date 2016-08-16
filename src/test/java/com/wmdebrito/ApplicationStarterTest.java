package com.wmdebrito;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wmdebrito.cli.CLIRunner;
import com.wmdebrito.model.github.json.GitHubSearchResults;
import com.wmdebrito.model.twitter.json.TweetSearchResults;
import com.wmdebrito.repository.SearchRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TestConfig.class, ApplicationStarter.class})
public class ApplicationStarterTest {

    @Autowired
    SearchRepository searchRepository;

    @Autowired
    CLIRunner runner;

    ObjectMapper mapper = new ObjectMapper();

    @Before
    public void config() throws IOException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        TweetSearchResults tweetSearchResults = mapper.readValue(contextClassLoader.getResourceAsStream("tweets.json"), TweetSearchResults.class);

        GitHubSearchResults gitHubSearchResults = mapper.readValue(contextClassLoader.getResourceAsStream("github.json"), GitHubSearchResults.class);

        when(searchRepository.searchRepositories("Reactive")).thenReturn(gitHubSearchResults);
        when(searchRepository.searchTweets("reactive")).thenReturn(tweetSearchResults);
    }


    @Test
    public void TestCliAndCamel() throws IOException {
        File f = new File("./summary.json");
        if (f.exists()) f.delete();

        runner.run(null);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream is1 = new FileInputStream(f);
        InputStream is2 = new FileInputStream(contextClassLoader.getResource("summary.json").getPath());
        Assert.assertTrue(is1.available() == is2.available());

    }

}
