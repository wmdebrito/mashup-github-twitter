
package com.wmdebrito.model.summary;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "name",
        "full_name",
        "url",
        "tweet"
})
public class Summary {

    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("tweetInfos")
    private List<TweetInfo> tweetInfos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The fullName
     */
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName The full_name
     */
    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The tweetInfos
     */
    @JsonProperty("tweetInfos")
    public List<TweetInfo> getTweetInfos() {
        return tweetInfos;
    }

    /**
     * @param tweetInfos The tweetInfos
     */
    @JsonProperty("tweetInfos")
    public void setTweetInfos(List<TweetInfo> tweetInfos) {
        this.tweetInfos = tweetInfos;
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
