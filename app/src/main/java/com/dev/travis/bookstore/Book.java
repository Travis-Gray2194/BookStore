package com.dev.travis.bookstore;

import android.text.TextUtils;

import com.dev.travis.bookstore.Models.Doc;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;

public class Book implements Serializable {

    private String openLibraryId;
    private String author;
    private String title;

    public Book(String openLibraryId, String author, String title) {
        this.openLibraryId = openLibraryId;
        this.author = author;
        this.title = title;
    }

    public Book() {
    }

    public Book(Doc doc) {
        this.openLibraryId = (doc.getIdLibrarything() != null) ? doc.getIdLibrarything().get(0) : "10920192021";
        this.author = doc.getAuthorName() != null && doc.getAuthorName().size() != 0 ? doc.getAuthorName().get(0) : "Author name"  ;
        this.title =  doc.getTitle() != null ? doc.getTitle() : "Empty Title";

    }

    public String getOpenLibraryId() {
        return openLibraryId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    // Get medium sized book cover from covers API
    public String getCoverURl() {
        return getLargeCoverUrl();
    }
    // Get large sized book cover from covers API
    public String getLargeCoverUrl() {


        return "http://covers.openlibrary.org/b/isbn/9780385533225-S.jpg"+openLibraryId+".jpg";
//        return "http://covers.openlibrary.org/b/olid/" + openLibraryId + "-L.jpg?default=false";
    }

    // Returns a Book given the expected JSON
    public static Book fromJson(JSONObject jsonObject){
        Book book = new Book();
        try{
            // Deserialize json into object fields
            // Check if a cover edition is available
            if (jsonObject.has("cover_edition_key")){
                book.openLibraryId = jsonObject.getString("cover_edition_key");
            } else if (jsonObject.has("edition_key")) {
                final JSONArray ids = jsonObject.getJSONArray("edition_key");
                book.openLibraryId = ids.getString(0);
            } book.title = jsonObject.has("title_suggest") ? jsonObject.getString("title_suggest") : "";
            book.author = getAuthor(jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        // Return new object
        return book;
        }


    // Return comma separated author list when there is more than one author
    private static String getAuthor(final JSONObject jsonObject) {
        try {
            final JSONArray authors = jsonObject.getJSONArray("author_name");
            int numAuthors = authors.length();
            final String[] authorStrings = new String[numAuthors];
            for (int i = 0; i < numAuthors; ++i) {
                authorStrings[i] = authors.getString(i);
            }
            return TextUtils.join(", ", authorStrings);
        } catch (JSONException e) {
            return "";
        }
    }

    // Decodes array of book json results into business model objects
    public static ArrayList<Book> fromJson(JSONArray jsonArray) {
        ArrayList<Book> books = new ArrayList<Book>(jsonArray.length());
        // Process each result in json array, decode and convert to business
        // object
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject bookJson = null;
            try {
                bookJson = jsonArray.getJSONObject(i);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            Book book = Book.fromJson(bookJson);
            if (book != null) {
                books.add(book);
            }
        }
        return books;
    }
}

