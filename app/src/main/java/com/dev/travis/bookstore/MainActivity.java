package com.dev.travis.bookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dev.travis.bookstore.Adapter.RecyclerViewBook;
import com.dev.travis.bookstore.Models.Doc;
import com.dev.travis.bookstore.Models.SearchResults;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView rvBooks;
    private RecyclerViewBook bookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://openlibrary.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final RecyclerView rvBooks= (RecyclerView) findViewById(R.id.rvBooks);
        final ArrayList<Book> aBooks = new ArrayList<Book>();
        bookAdapter = new RecyclerViewBook(this,aBooks);


        rvBooks.setAdapter(bookAdapter);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvBooks.setLayoutManager(layoutManager);
        BookService.iBookService service = retrofit.create(BookService.iBookService.class);



        service.Search("Lord of the Rings").enqueue(new Callback<SearchResults>() {
            @Override
            public void onResponse(Call<SearchResults> call, Response<SearchResults> response) {
                System.out.println("Test1");
                List<Doc> dox = response.body().getDocs();
                ArrayList<Book> docstobook = MainActivity.convertdocs(response.body().getDocs());
                bookAdapter = new RecyclerViewBook(getApplicationContext(),docstobook);
                rvBooks.setAdapter(bookAdapter);


            }

            @Override
            public void onFailure(Call<SearchResults> call, Throwable t) {
                System.out.println("Test2");

            }
        });


    }


    public static ArrayList<Book> convertdocs(List<Doc> docs) {
        ArrayList<Book> retunArrayList = new ArrayList<>();
        for (Doc doc : docs){
            Book newBook  = new Book(doc);
            retunArrayList.add(newBook);
        }


    return retunArrayList;
    }


}
