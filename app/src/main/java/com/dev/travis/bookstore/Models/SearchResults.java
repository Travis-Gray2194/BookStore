
package com.dev.travis.bookstore.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResults {

    @SerializedName("start")
    @Expose
    private int start;
    @SerializedName("num_found")
    @Expose
    private int numFound;
    @SerializedName("docs")
    @Expose
    private List<Doc> docs = null;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public SearchResults withStart(int start) {
        this.start = start;
        return this;
    }

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public SearchResults withNumFound(int numFound) {
        this.numFound = numFound;
        return this;
    }

    public List<Doc> getDocs() {
        return docs;
    }

    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    public SearchResults withDocs(List<Doc> docs) {
        this.docs = docs;
        return this;
    }

}
