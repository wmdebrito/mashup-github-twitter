package com.wmdebrito.processor;

import com.wmdebrito.model.github.json.GitHubSearchResults;
import com.wmdebrito.model.github.json.Item;
import com.wmdebrito.model.summary.Summary;
import com.wmdebrito.model.summary.TweetInfo;
import com.wmdebrito.model.twitter.json.Status;
import com.wmdebrito.model.twitter.json.TweetSearchResults;
import com.wmdebrito.repository.SearchRepository;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL-WAGNER on 16-Aug-16.
 */
@Component
public class TwitterProcessor implements Processor {
    @Autowired
    private SearchRepository searchRepository;

    public void process(Exchange exchange) throws Exception {
        GitHubSearchResults gitHubSearchResults = (GitHubSearchResults) exchange.getIn().getBody();
        List<Summary> repoTweetInfo = new ArrayList();

        if (gitHubSearchResults != null)
            for (Item item : gitHubSearchResults.getItems()) {
                Summary info = new Summary();
                info.setFullName(item.getFullName());
                info.setName(item.getName());
                info.setUrl(item.getUrl());
                info.setTweetInfos(new ArrayList<TweetInfo>());

                TweetSearchResults tweetSearchResults = searchRepository.searchTweets(info.getName());
                for (Status statuses : tweetSearchResults.getStatuses()) {
                    TweetInfo tweetInfo = new TweetInfo();
                    tweetInfo.setDescription(statuses.getText());
                    tweetInfo.setCreatedAt(statuses.getCreatedAt());
                    tweetInfo.setUserId(statuses.getUser().getScreenName());
                    info.getTweetInfos().add(tweetInfo);
                }
                repoTweetInfo.add(info);
            }
        exchange.getOut().setBody(repoTweetInfo);
    }

}
