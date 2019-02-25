package com.dev.travis.bookstore.Adapter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.travis.bookstore.Book;
import com.dev.travis.bookstore.BookAdapter;
import com.dev.travis.bookstore.BookDetailActivity;
import com.dev.travis.bookstore.MainActivity;
import com.dev.travis.bookstore.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewBook extends RecyclerView.Adapter<RecyclerViewBook.ViewHolder> {

    public static String bookExtra = "BookExtras";
    private Context appContext;

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivCover;
        public TextView tvTitle;
        public TextView tvAuthor;

        public ViewHolder(View itemView) {
            super(itemView);

            ivCover = (ImageView) itemView.findViewById(R.id.ivBookCover);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvAuthor = (TextView) itemView.findViewById(R.id.tvAuthor);


        }
    }

    // Store a member variable for the contacts
    private List<Book> mBooks;

    // Pass in the contact array into the constructor
    public RecyclerViewBook(@NonNull Context context, List<Book> books) {
        appContext = context;
        mBooks = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);


        View BookView = inflater.inflate(R.layout.item_book, parent, false);

        ViewHolder viewHolder = new ViewHolder(BookView);


        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull  ViewHolder viewHolder, final int position) {

        Book book = mBooks.get(position);
        // Populate the data into the template view using the data object
        viewHolder.tvTitle.setText(book.getTitle());
        viewHolder.tvAuthor.setText(book.getAuthor());
        Picasso.with(appContext).load(Uri.parse(book.getCoverURl())).error(R.drawable.ic_nocover).into(viewHolder.ivCover);
        // Return the completed view to render on screen

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookdetialview = new Intent(v.getContext(), BookDetailActivity.class);
                bookdetialview.putExtra(bookExtra,mBooks.get(position));
                v.getContext().startActivity(bookdetialview);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }
}

