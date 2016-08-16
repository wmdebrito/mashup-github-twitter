
package com.wmdebrito.model.twitter.json;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "created_at",
        "id",
        "id_str",
        "text",
        "truncated",
        "entities",
        "metadata",
        "source",
        "in_reply_to_status_id",
        "in_reply_to_status_id_str",
        "in_reply_to_user_id",
        "in_reply_to_user_id_str",
        "in_reply_to_screen_name",
        "user",
        "geo",
        "coordinates",
        "place",
        "contributors",
        "is_quote_status",
        "retweet_count",
        "favorite_count",
        "favorited",
        "retweeted",
        "lang",
        "retweeted_status",
        "possibly_sensitive"
})
public class Status {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("text")
    private String text;
    @JsonProperty("truncated")
    private boolean truncated;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("source")
    private String source;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("user")
    private User user;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("is_quote_status")
    private boolean isQuoteStatus;
    @JsonProperty("retweet_count")
    private long retweetCount;
    @JsonProperty("favorite_count")
    private long favoriteCount;
    @JsonProperty("favorited")
    private boolean favorited;
    @JsonProperty("retweeted")
    private boolean retweeted;
    @JsonProperty("lang")
    private String lang;

    @JsonProperty("possibly_sensitive")
    private boolean possiblySensitive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return The idStr
     */
    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    /**
     * @param idStr The id_str
     */
    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     * @return The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The truncated
     */
    @JsonProperty("truncated")
    public boolean isTruncated() {
        return truncated;
    }

    /**
     * @param truncated The truncated
     */
    @JsonProperty("truncated")
    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * @return The entities
     */
    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    /**
     * @param entities The entities
     */
    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    /**
     * @return The metadata
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * @param metadata The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * @return The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The inReplyToStatusId
     */
    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * @param inReplyToStatusId The in_reply_to_status_id
     */
    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     * @return The inReplyToStatusIdStr
     */
    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     * @param inReplyToStatusIdStr The in_reply_to_status_id_str
     */
    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    /**
     * @return The inReplyToUserId
     */
    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * @param inReplyToUserId The in_reply_to_user_id
     */
    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     * @return The inReplyToUserIdStr
     */
    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     * @param inReplyToUserIdStr The in_reply_to_user_id_str
     */
    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    /**
     * @return The inReplyToScreenName
     */
    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * @param inReplyToScreenName The in_reply_to_screen_name
     */
    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     * @return The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return The geo
     */
    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    /**
     * @param geo The geo
     */
    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * @return The coordinates
     */
    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return The place
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * @param place The place
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     * @return The contributors
     */
    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    /**
     * @param contributors The contributors
     */
    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     * @return The isQuoteStatus
     */
    @JsonProperty("is_quote_status")
    public boolean isIsQuoteStatus() {
        return isQuoteStatus;
    }

    /**
     * @param isQuoteStatus The is_quote_status
     */
    @JsonProperty("is_quote_status")
    public void setIsQuoteStatus(boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    /**
     * @return The retweetCount
     */
    @JsonProperty("retweet_count")
    public long getRetweetCount() {
        return retweetCount;
    }

    /**
     * @param retweetCount The retweet_count
     */
    @JsonProperty("retweet_count")
    public void setRetweetCount(long retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     * @return The favoriteCount
     */
    @JsonProperty("favorite_count")
    public long getFavoriteCount() {
        return favoriteCount;
    }

    /**
     * @param favoriteCount The favorite_count
     */
    @JsonProperty("favorite_count")
    public void setFavoriteCount(long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    /**
     * @return The favorited
     */
    @JsonProperty("favorited")
    public boolean isFavorited() {
        return favorited;
    }

    /**
     * @param favorited The favorited
     */
    @JsonProperty("favorited")
    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * @return The retweeted
     */
    @JsonProperty("retweeted")
    public boolean isRetweeted() {
        return retweeted;
    }

    /**
     * @param retweeted The retweeted
     */
    @JsonProperty("retweeted")
    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * @return The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * @param lang The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }


    /**
     * @return The possiblySensitive
     */
    @JsonProperty("possibly_sensitive")
    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    /**
     * @param possiblySensitive The possibly_sensitive
     */
    @JsonProperty("possibly_sensitive")
    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
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
