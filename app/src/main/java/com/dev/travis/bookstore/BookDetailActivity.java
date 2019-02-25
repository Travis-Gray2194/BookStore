package com.dev.travis.bookstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.dev.travis.bookstore.Adapter.RecyclerViewBook;

public class BookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        bindData((Book)getIntent().getExtras().getSerializable(RecyclerViewBook.BOOK_EXTRA));

//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(),BookDetailActivity.this));
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
//        tabLayout.setupWithViewPager(viewPager);
    }

    private void bindData(Book book) {

        Toast.makeText(getApplicationContext(),book.getAuthor(),Toast.LENGTH_LONG).show();
    }
}
