
package com.wmdebrito.model.twitter.json;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "id_str",
        "name",
        "screen_name",
        "location",
        "description",
        "url",
        "entities",
        "protected",
        "followers_count",
        "friends_count",
        "listed_count",
        "created_at",
        "favourites_count",
        "utc_offset",
        "time_zone",
        "geo_enabled",
        "verified",
        "statuses_count",
        "lang",
        "contributors_enabled",
        "is_translator",
        "is_translation_enabled",
        "profile_background_color",
        "profile_background_image_url",
        "profile_background_image_url_https",
        "profile_background_tile",
        "profile_image_url",
        "profile_image_url_https",
        "profile_banner_url",
        "profile_link_color",
        "profile_sidebar_border_color",
        "profile_sidebar_fill_color",
        "profile_text_color",
        "profile_use_background_image",
        "has_extended_profile",
        "default_profile",
        "default_profile_image",
        "following",
        "follow_request_sent",
        "notifications"
})
public class User {

    @JsonProperty("id")
    private long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("name")
    private String name;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("description")
    private String description;
    @JsonProperty("url")
    private String url;
    @JsonProperty("protected")
    private boolean _protected;
    @JsonProperty("followers_count")
    private long followersCount;
    @JsonProperty("friends_count")
    private long friendsCount;
    @JsonProperty("listed_count")
    private long listedCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("favourites_count")
    private long favouritesCount;
    @JsonProperty("utc_offset")
    private long utcOffset;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("geo_enabled")
    private boolean geoEnabled;
    @JsonProperty("verified")
    private boolean verified;
    @JsonProperty("statuses_count")
    private long statusesCount;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("contributors_enabled")
    private boolean contributorsEnabled;
    @JsonProperty("is_translator")
    private boolean isTranslator;
    @JsonProperty("is_translation_enabled")
    private boolean isTranslationEnabled;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profile_background_tile")
    private boolean profileBackgroundTile;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("profile_image_url_https")
    private String profileImageUrlHttps;
    @JsonProperty("profile_banner_url")
    private String profileBannerUrl;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("profile_use_background_image")
    private boolean profileUseBackgroundImage;
    @JsonProperty("has_extended_profile")
    private boolean hasExtendedProfile;
    @JsonProperty("default_profile")
    private boolean defaultProfile;
    @JsonProperty("default_profile_image")
    private boolean defaultProfileImage;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("follow_request_sent")
    private Object followRequestSent;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * @return The screenName
     */
    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    /**
     * @param screenName The screen_name
     */
    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * @return The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
     * @return The _protected
     */
    @JsonProperty("protected")
    public boolean isProtected() {
        return _protected;
    }

    /**
     * @param _protected The protected
     */
    @JsonProperty("protected")
    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    /**
     * @return The followersCount
     */
    @JsonProperty("followers_count")
    public long getFollowersCount() {
        return followersCount;
    }

    /**
     * @param followersCount The followers_count
     */
    @JsonProperty("followers_count")
    public void setFollowersCount(long followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * @return The friendsCount
     */
    @JsonProperty("friends_count")
    public long getFriendsCount() {
        return friendsCount;
    }

    /**
     * @param friendsCount The friends_count
     */
    @JsonProperty("friends_count")
    public void setFriendsCount(long friendsCount) {
        this.friendsCount = friendsCount;
    }

    /**
     * @return The listedCount
     */
    @JsonProperty("listed_count")
    public long getListedCount() {
        return listedCount;
    }

    /**
     * @param listedCount The listed_count
     */
    @JsonProperty("listed_count")
    public void setListedCount(long listedCount) {
        this.listedCount = listedCount;
    }

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
     * @return The favouritesCount
     */
    @JsonProperty("favourites_count")
    public long getFavouritesCount() {
        return favouritesCount;
    }

    /**
     * @param favouritesCount The favourites_count
     */
    @JsonProperty("favourites_count")
    public void setFavouritesCount(long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     * @return The utcOffset
     */
    @JsonProperty("utc_offset")
    public long getUtcOffset() {
        return utcOffset;
    }

    /**
     * @param utcOffset The utc_offset
     */
    @JsonProperty("utc_offset")
    public void setUtcOffset(long utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     * @return The timeZone
     */
    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone The time_zone
     */
    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return The geoEnabled
     */
    @JsonProperty("geo_enabled")
    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    /**
     * @param geoEnabled The geo_enabled
     */
    @JsonProperty("geo_enabled")
    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    /**
     * @return The verified
     */
    @JsonProperty("verified")
    public boolean isVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    @JsonProperty("verified")
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    /**
     * @return The statusesCount
     */
    @JsonProperty("statuses_count")
    public long getStatusesCount() {
        return statusesCount;
    }

    /**
     * @param statusesCount The statuses_count
     */
    @JsonProperty("statuses_count")
    public void setStatusesCount(long statusesCount) {
        this.statusesCount = statusesCount;
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
     * @return The contributorsEnabled
     */
    @JsonProperty("contributors_enabled")
    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    /**
     * @param contributorsEnabled The contributors_enabled
     */
    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    /**
     * @return The isTranslator
     */
    @JsonProperty("is_translator")
    public boolean isIsTranslator() {
        return isTranslator;
    }

    /**
     * @param isTranslator The is_translator
     */
    @JsonProperty("is_translator")
    public void setIsTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    /**
     * @return The isTranslationEnabled
     */
    @JsonProperty("is_translation_enabled")
    public boolean isIsTranslationEnabled() {
        return isTranslationEnabled;
    }

    /**
     * @param isTranslationEnabled The is_translation_enabled
     */
    @JsonProperty("is_translation_enabled")
    public void setIsTranslationEnabled(boolean isTranslationEnabled) {
        this.isTranslationEnabled = isTranslationEnabled;
    }

    /**
     * @return The profileBackgroundColor
     */
    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    /**
     * @param profileBackgroundColor The profile_background_color
     */
    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    /**
     * @return The profileBackgroundImageUrl
     */
    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    /**
     * @param profileBackgroundImageUrl The profile_background_image_url
     */
    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    /**
     * @return The profileBackgroundImageUrlHttps
     */
    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    /**
     * @param profileBackgroundImageUrlHttps The profile_background_image_url_https
     */
    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    /**
     * @return The profileBackgroundTile
     */
    @JsonProperty("profile_background_tile")
    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    /**
     * @param profileBackgroundTile The profile_background_tile
     */
    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    /**
     * @return The profileImageUrl
     */
    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * @param profileImageUrl The profile_image_url
     */
    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    /**
     * @return The profileImageUrlHttps
     */
    @JsonProperty("profile_image_url_https")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     * @param profileImageUrlHttps The profile_image_url_https
     */
    @JsonProperty("profile_image_url_https")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    /**
     * @return The profileBannerUrl
     */
    @JsonProperty("profile_banner_url")
    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    /**
     * @param profileBannerUrl The profile_banner_url
     */
    @JsonProperty("profile_banner_url")
    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    /**
     * @return The profileLinkColor
     */
    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    /**
     * @param profileLinkColor The profile_link_color
     */
    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    /**
     * @return The profileSidebarBorderColor
     */
    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    /**
     * @param profileSidebarBorderColor The profile_sidebar_border_color
     */
    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    /**
     * @return The profileSidebarFillColor
     */
    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    /**
     * @param profileSidebarFillColor The profile_sidebar_fill_color
     */
    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    /**
     * @return The profileTextColor
     */
    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    /**
     * @param profileTextColor The profile_text_color
     */
    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    /**
     * @return The profileUseBackgroundImage
     */
    @JsonProperty("profile_use_background_image")
    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    /**
     * @param profileUseBackgroundImage The profile_use_background_image
     */
    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    /**
     * @return The hasExtendedProfile
     */
    @JsonProperty("has_extended_profile")
    public boolean isHasExtendedProfile() {
        return hasExtendedProfile;
    }

    /**
     * @param hasExtendedProfile The has_extended_profile
     */
    @JsonProperty("has_extended_profile")
    public void setHasExtendedProfile(boolean hasExtendedProfile) {
        this.hasExtendedProfile = hasExtendedProfile;
    }

    /**
     * @return The defaultProfile
     */
    @JsonProperty("default_profile")
    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    /**
     * @param defaultProfile The default_profile
     */
    @JsonProperty("default_profile")
    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    /**
     * @return The defaultProfileImage
     */
    @JsonProperty("default_profile_image")
    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    /**
     * @param defaultProfileImage The default_profile_image
     */
    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    /**
     * @return The following
     */
    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    /**
     * @return The followRequestSent
     */
    @JsonProperty("follow_request_sent")
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    /**
     * @param followRequestSent The follow_request_sent
     */
    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    /**
     * @return The notifications
     */
    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    /**
     * @param notifications The notifications
     */
    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
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
