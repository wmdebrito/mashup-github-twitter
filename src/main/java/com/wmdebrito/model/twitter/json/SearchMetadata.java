
package com.wmdebrito.model.twitter.json;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "completed_in",
        "max_id",
        "max_id_str",
        "next_results",
        "query",
        "refresh_url",
        "count",
        "since_id",
        "since_id_str"
})
public class SearchMetadata {

    @JsonProperty("completed_in")
    private double completedIn;
    @JsonProperty("max_id")
    private long maxId;
    @JsonProperty("max_id_str")
    private String maxIdStr;
    @JsonProperty("next_results")
    private String nextResults;
    @JsonProperty("query")
    private String query;
    @JsonProperty("refresh_url")
    private String refreshUrl;
    @JsonProperty("count")
    private long count;
    @JsonProperty("since_id")
    private long sinceId;
    @JsonProperty("since_id_str")
    private String sinceIdStr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The completedIn
     */
    @JsonProperty("completed_in")
    public double getCompletedIn() {
        return completedIn;
    }

    /**
     * @param completedIn The completed_in
     */
    @JsonProperty("completed_in")
    public void setCompletedIn(double completedIn) {
        this.completedIn = completedIn;
    }

    /**
     * @return The maxId
     */
    @JsonProperty("max_id")
    public long getMaxId() {
        return maxId;
    }

    /**
     * @param maxId The max_id
     */
    @JsonProperty("max_id")
    public void setMaxId(long maxId) {
        this.maxId = maxId;
    }

    /**
     * @return The maxIdStr
     */
    @JsonProperty("max_id_str")
    public String getMaxIdStr() {
        return maxIdStr;
    }

    /**
     * @param maxIdStr The max_id_str
     */
    @JsonProperty("max_id_str")
    public void setMaxIdStr(String maxIdStr) {
        this.maxIdStr = maxIdStr;
    }

    /**
     * @return The nextResults
     */
    @JsonProperty("next_results")
    public String getNextResults() {
        return nextResults;
    }

    /**
     * @param nextResults The next_results
     */
    @JsonProperty("next_results")
    public void setNextResults(String nextResults) {
        this.nextResults = nextResults;
    }

    /**
     * @return The query
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * @param query The query
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return The refreshUrl
     */
    @JsonProperty("refresh_url")
    public String getRefreshUrl() {
        return refreshUrl;
    }

    /**
     * @param refreshUrl The refresh_url
     */
    @JsonProperty("refresh_url")
    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    /**
     * @return The count
     */
    @JsonProperty("count")
    public long getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    @JsonProperty("count")
    public void setCount(long count) {
        this.count = count;
    }

    /**
     * @return The sinceId
     */
    @JsonProperty("since_id")
    public long getSinceId() {
        return sinceId;
    }

    /**
     * @param sinceId The since_id
     */
    @JsonProperty("since_id")
    public void setSinceId(long sinceId) {
        this.sinceId = sinceId;
    }

    /**
     * @return The sinceIdStr
     */
    @JsonProperty("since_id_str")
    public String getSinceIdStr() {
        return sinceIdStr;
    }

    /**
     * @param sinceIdStr The since_id_str
     */
    @JsonProperty("since_id_str")
    public void setSinceIdStr(String sinceIdStr) {
        this.sinceIdStr = sinceIdStr;
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
