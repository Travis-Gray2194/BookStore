package com.dev.travis.bookstore;

import com.dev.travis.bookstore.Models.SearchResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class BookService {

    public interface iBookService {
        @GET("search.json")
        Call<SearchResults> Search(@Query("title") String title);
    }
}
