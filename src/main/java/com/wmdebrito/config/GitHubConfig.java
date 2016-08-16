package com.wmdebrito.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "github")
@Component
public class GitHubConfig {

    private String searchRepositoriesUrl;

    private String perPage;

    public String getSearchRepositoriesUrl() {
        return searchRepositoriesUrl;
    }

    public void setSearchRepositoriesUrl(String searchRepositoriesUrl) {
        this.searchRepositoriesUrl = searchRepositoriesUrl;
    }


    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }
}
