
package com.wmdebrito.model.twitter.json;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "hashtags",
        "symbols",
        "user_mentions",
        "urls"
})
public class Entities {

    @JsonProperty("hashtags")
    private List<Object> hashtags = new ArrayList<Object>();
    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("user_mentions")
    private List<Object> userMentions = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Object> urls = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The hashtags
     */
    @JsonProperty("hashtags")
    public List<Object> getHashtags() {
        return hashtags;
    }

    /**
     * @param hashtags The hashtags
     */
    @JsonProperty("hashtags")
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * @return The symbols
     */
    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    /**
     * @param symbols The symbols
     */
    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    /**
     * @return The userMentions
     */
    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    /**
     * @param userMentions The user_mentions
     */
    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    /**
     * @return The urls
     */
    @JsonProperty("urls")
    public List<Object> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    @JsonProperty("urls")
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
