
package com.wmdebrito.model.github.json;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "total_count",
        "incomplete_results",
        "items"
})
public class GitHubSearchResults {

    @JsonProperty("total_count")
    private long totalCount;
    @JsonProperty("incomplete_results")
    private boolean incompleteResults;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The totalCount
     */
    @JsonProperty("total_count")
    public long getTotalCount() {
        return totalCount;
    }

    /**
     * @param totalCount The total_count
     */
    @JsonProperty("total_count")
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * @return The incompleteResults
     */
    @JsonProperty("incomplete_results")
    public boolean isIncompleteResults() {
        return incompleteResults;
    }

    /**
     * @param incompleteResults The incomplete_results
     */
    @JsonProperty("incomplete_results")
    public void setIncompleteResults(boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    /**
     * @return The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
