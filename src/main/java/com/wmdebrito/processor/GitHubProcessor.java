package com.wmdebrito.processor;

import com.wmdebrito.model.github.json.GitHubSearchResults;
import com.wmdebrito.repository.SearchRepository;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by DELL-WAGNER on 16-Aug-16.
 */
@Component
public class GitHubProcessor implements Processor {
    @Autowired
    private SearchRepository searchRepository;

    public void process(Exchange exchange) throws Exception {
        String searchTerm = (String) exchange.getIn().getBody();
        GitHubSearchResults gitHubSearchResults = searchRepository.searchRepositories(searchTerm);
        exchange.getOut().setBody(gitHubSearchResults);
    }
}
