package com.wmdebrito;

import com.wmdebrito.config.GitHubConfig;
import com.wmdebrito.config.TwitterConfig;
import com.wmdebrito.repository.SearchRepository;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by DELL-WAGNER on 16-Aug-16.
 */
@Profile("test")
@Configuration
public class TestConfig {
    @Bean
    @Primary
    public SearchRepository searchRepository() {
        return Mockito.mock(SearchRepository.class);
    }

    @Bean
    @Primary
    public TwitterConfig twitterConfig() {
        return new TwitterConfig();
    }

    @Bean
    @Primary
    public GitHubConfig gitHubConfig() {
        return new GitHubConfig();
    }
}