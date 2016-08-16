package com.wmdebrito.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "twitter")
@Component
public class TwitterConfig {

    private String consumerKey;
    private String consumerSecret;
    private String oauth2TokenUrl;
    private String searchUrl;
    private String count;

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getOauth2TokenUrl() {
        return oauth2TokenUrl;
    }

    public void setOauth2TokenUrl(String oauth2TokenUrl) {
        this.oauth2TokenUrl = oauth2TokenUrl;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
