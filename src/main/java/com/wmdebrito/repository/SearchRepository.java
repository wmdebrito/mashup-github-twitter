package com.wmdebrito.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wmdebrito.config.GitHubConfig;
import com.wmdebrito.config.TwitterConfig;
import com.wmdebrito.model.github.json.GitHubSearchResults;
import com.wmdebrito.model.twitter.Token;
import com.wmdebrito.model.twitter.json.TweetSearchResults;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SearchRepository {

    public static final String QUERY_INDICATOR = "q";
    public static final String GITHUB_PER_PAGE = "per_page";
    public static final String TWEETS_PER_PAGE = "count";

    @Autowired
    private TwitterConfig twitterConfig;

    @Autowired
    private GitHubConfig gitHubConfig;

    private ObjectMapper mapper = new ObjectMapper();

    public TweetSearchResults searchTweets(String query) throws IOException {
        Token token = getAccessToken();
        String authHeader = token.getTokenType() + " " + token.getAccessToken();

        Map<String, String> header = new HashMap<String, String>();
        header.put(HttpHeaders.AUTHORIZATION, authHeader);

        Map<String, String> params = new HashMap<String, String>();
        params.put(QUERY_INDICATOR, query);
        params.put(TWEETS_PER_PAGE, twitterConfig.getCount());

        HttpRequestBase request = createGetRequest(new URL(twitterConfig.getSearchUrl()), header, params);
        HttpEntity entity = getHttpEntity(request);

        return mapper.readValue(entity.getContent(), TweetSearchResults.class);
    }

    public GitHubSearchResults searchRepositories(String query) throws IOException {

        Map<String, String> params = new HashMap<String, String>();
        params.put(QUERY_INDICATOR, query);
        params.put(GITHUB_PER_PAGE, gitHubConfig.getPerPage());

        HttpRequestBase request = createGetRequest(new URL(gitHubConfig.getSearchRepositoriesUrl()), null, params);

        HttpEntity entity = getHttpEntity(request);
        return mapper.readValue(entity.getContent(), GitHubSearchResults.class);
    }


    protected HttpRequestBase createPostRequest(URL url, Map<String, String> header, Map<String, String> params) throws UnsupportedEncodingException {
        HttpPost request = new HttpPost(url.toString());
        setHeader(header, request);
        List<NameValuePair> listValuePair = getNameValuePairs(params);
        UrlEncodedFormEntity postEntity = new UrlEncodedFormEntity(listValuePair);
        request.setEntity(postEntity);

        return request;
    }

    protected HttpRequestBase createGetRequest(URL url, Map<String, String> header, Map<String, String> params) throws UnsupportedEncodingException {
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setPath(url.toString());
        uriBuilder.setParameters(getNameValuePairs(params));

        HttpGet request = new HttpGet(uriBuilder.toString());
        setHeader(header, request);


        return request;
    }

    protected List<NameValuePair> getNameValuePairs(Map<String, String> params) {
        List<NameValuePair> listValuePair = new ArrayList();
        if (params != null) {
            for (String key : params.keySet()) {
                listValuePair.add(new BasicNameValuePair(key, params.get(key)));
            }
        }
        return listValuePair;
    }

    protected void setHeader(Map<String, String> header, HttpRequestBase request) {
        if (header != null) {
            for (String key : header.keySet()) {
                request.setHeader(key, header.get(key));
            }
        }
    }

    protected Token getAccessToken() throws IOException {
        String auth = twitterConfig.getConsumerKey() + ":" + twitterConfig.getConsumerSecret();
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes());
        String authHeader = "Basic " + new String(encodedAuth);

        Map<String, String> header = new HashMap<String, String>();
        header.put(HttpHeaders.AUTHORIZATION, authHeader);

        Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "client_credentials");

        HttpRequestBase request = createPostRequest(new URL(twitterConfig.getOauth2TokenUrl()), header, params);
        HttpEntity entity = getHttpEntity(request);

        return mapper.readValue(entity.getContent(), Token.class);
    }


    protected HttpEntity getHttpEntity(HttpRequestBase request) throws IOException {
        HttpClient client = HttpClientBuilder.create().build();
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        int statusCode = response.getStatusLine().getStatusCode();
        if (entity == null || statusCode != 200) throw new IOException("Http Error");
        return entity;
    }
}