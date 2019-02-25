package com.dev.travis.bookstore;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dev.travis.bookstore.Adapter.RecyclerViewBook;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

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

        TextView authour = findViewById(R.id.book_detail_author);
        TextView title = findViewById(R.id.book_detail_title);
        authour.setText(book.getAuthor());
        title.setText(book.getTitle());
        ImageView image = findViewById(R.id.book_detail_imageview);
//        Custom URL downloader for redirection
       OkHttp3Downloader downloader = new OkHttp3Downloader(getApplicationContext());
       Picasso pdownloader = new Picasso.Builder(getApplicationContext()).downloader(downloader).build();
        pdownloader.with(getApplicationContext()).load(Uri.parse(book.getCoverURl())).error(R.drawable.ic_nocover).into(image);
        Toast.makeText(getApplicationContext(),book.getAuthor(),Toast.LENGTH_LONG).show();
    }
}
