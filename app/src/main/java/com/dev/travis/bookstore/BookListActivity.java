package com.dev.travis.bookstore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.dev.travis.bookstore.Adapter.RecyclerViewBook;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.entity.mime.Header;

public class BookListActivity extends AppCompatActivity {
    private RecyclerViewBook rvBooks;
    private BookAdapter bookAdapter;
    private BookClient client;

    public static final String BOOK_DETAIL_KEY = "book";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Fetch the data remotely
         fetchBooks();
    }



    // Executes an API call to the OpenLibrary search endpoint, parses the results
    // Converts them into an array of book objects and adds them to the adapter
    private void fetchBooks() {
        client = new BookClient();
        client.getBooks("oscar Wilde", new JsonHttpResponseHandler() {

            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                try {
                    JSONArray docs = null;
                    if(response != null) {
                        // Get the docs json array
                        docs = response.getJSONArray("docs");
                        // Parse json array into array of model objects
                        final ArrayList<Book> books = Book.fromJson(docs);
                        // Remove all books from the adapter
                        bookAdapter.clear();
                        // Load model objects into the adapter
                        for (Book book : books) {
                            bookAdapter.add(book); // add book through the adapter
                        }
                        bookAdapter.notifyDataSetChanged();
                    }
                } catch (JSONException e) {
                    // Invalid JSON format, show appropriate error.
                    e.printStackTrace();
                }
            }
        });
    }

    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + bookAdapter.getItem(position) + " on item position " + position, Toast.LENGTH_SHORT).show();
    }
}
