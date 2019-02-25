package com.dev.travis.bookstore;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.dev.travis.bookstore.Models.Doc;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {



    private static class ViewHolder {
        public ImageView ivCover;
        public TextView tvTitle;
        public TextView tvAuthor;
    }


    public BookAdapter(Context context, int resource, List<Book> objects) {
        super(context, resource, objects);
    }


    @Override
    public void addAll(Book... items) {
        super.addAll(items);
    }

    // Translates a particular `Book` given a position
    // into a relevant row within an AdapterView
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

//        Get the data item for this position
        final Book book = getItem(position);

//        Check if an exiting view is being reused, otherwise inflate the view
        ViewHolder viewHolder;
        if(convertView ==null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_book, parent, false);
            viewHolder.ivCover = (ImageView) convertView.findViewById(R.id.ivBookCover);
            viewHolder.tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
            viewHolder.tvAuthor = (TextView) convertView.findViewById(R.id.tvAuthor);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.tvTitle.setText(book.getTitle());
        viewHolder.tvAuthor.setText(book.getAuthor());
        Picasso.with(getContext()).load(Uri.parse(book.getCoverURl())).error(R.drawable.ic_nocover).into(viewHolder.ivCover);
        // Return the completed view to render on screen
        return convertView;
    }


}
