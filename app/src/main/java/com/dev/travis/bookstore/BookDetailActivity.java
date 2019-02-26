package com.dev.travis.bookstore;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dev.travis.bookstore.Adapter.RecyclerViewBook;


import com.squareup.picasso.Picasso;

public class BookDetailActivity extends AppCompatActivity implements BookFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        bindData((Book)getIntent().getExtras().getSerializable(RecyclerViewBook.BOOK_EXTRA));

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(),BookDetailActivity.this));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void bindData(Book book) {

        TextView authour = findViewById(R.id.book_detail_author);
        TextView title = findViewById(R.id.book_detail_title);
        ImageView image = findViewById(R.id.book_detail_imageview);
        authour.setText(book.getAuthor());
        title.setText(book.getTitle());




        Picasso.get().load(book.getCoverURl()).error(R.drawable.ic_nocover).into(image);
        Toast.makeText(getApplicationContext(),book.getAuthor(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
