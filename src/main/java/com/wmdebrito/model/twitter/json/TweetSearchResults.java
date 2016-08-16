
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
        "statuses",
        "search_metadata"
})
public class TweetSearchResults {

    @JsonProperty("statuses")
    private List<Status> statuses = new ArrayList<Status>();
    @JsonProperty("search_metadata")
    private SearchMetadata searchMetadata;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The statuses
     */
    @JsonProperty("statuses")
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     * @param statuses The statuses
     */
    @JsonProperty("statuses")
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    /**
     * @return The searchMetadata
     */
    @JsonProperty("search_metadata")
    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    /**
     * @param searchMetadata The search_metadata
     */
    @JsonProperty("search_metadata")
    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
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
