package com.dev.travis.bookstore;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class BookClient {
    private static final String API_BASE_URL = "http://openlibrary.org/";
    private AsyncHttpClient client;

    public BookClient () {
        this.client = new AsyncHttpClient();
    }

    private String getApiUrl(String relativeUrl) {
        return API_BASE_URL + relativeUrl;
    }
    public void getBooks(final String query, JsonHttpResponseHandler handler) {
        try {
            String url = getApiUrl("search.json?limit=3?q=");
            client.get(url + URLEncoder.encode(query, "utf-8"), handler);
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}
