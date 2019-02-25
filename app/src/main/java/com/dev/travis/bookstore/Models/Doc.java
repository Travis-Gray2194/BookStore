
package com.dev.travis.bookstore.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doc {

    @SerializedName("title_suggest")
    @Expose
    private String titleSuggest;
    @SerializedName("edition_key")
    @Expose
    private List<String> editionKey = null;
    @SerializedName("cover_i")
    @Expose
    private int coverI;
    @SerializedName("isbn")
    @Expose
    private List<String> isbn = null;
    @SerializedName("has_fulltext")
    @Expose
    private boolean hasFulltext;
    @SerializedName("id_dep\u00f3sito_legal")
    @Expose
    private List<String> idDepSitoLegal = null;
    @SerializedName("text")
    @Expose
    private List<String> text = null;
    @SerializedName("author_name")
    @Expose
    private List<String> authorName = null;
    @SerializedName("contributor")
    @Expose
    private List<String> contributor = null;
    @SerializedName("ia_loaded_id")
    @Expose
    private List<String> iaLoadedId = null;
    @SerializedName("seed")
    @Expose
    private List<String> seed = null;
    @SerializedName("oclc")
    @Expose
    private List<String> oclc = null;
    @SerializedName("id_google")
    @Expose
    private List<String> idGoogle = null;
    @SerializedName("ia")
    @Expose
    private List<String> ia = null;
    @SerializedName("author_key")
    @Expose
    private List<String> authorKey = null;
    @SerializedName("subject")
    @Expose
    private List<String> subject = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("lending_identifier_s")
    @Expose
    private String lendingIdentifierS;
    @SerializedName("ia_collection_s")
    @Expose
    private String iaCollectionS;
    @SerializedName("first_publish_year")
    @Expose
    private int firstPublishYear;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ebook_count_i")
    @Expose
    private int ebookCountI;
    @SerializedName("publish_place")
    @Expose
    private List<String> publishPlace = null;
    @SerializedName("ia_box_id")
    @Expose
    private List<String> iaBoxId = null;
    @SerializedName("edition_count")
    @Expose
    private int editionCount;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("id_alibris_id")
    @Expose
    private List<String> idAlibrisId = null;
    @SerializedName("id_goodreads")
    @Expose
    private List<String> idGoodreads = null;
    @SerializedName("author_alternative_name")
    @Expose
    private List<String> authorAlternativeName = null;
    @SerializedName("public_scan_b")
    @Expose
    private boolean publicScanB;
    @SerializedName("id_overdrive")
    @Expose
    private List<String> idOverdrive = null;
    @SerializedName("publisher")
    @Expose
    private List<String> publisher = null;
    @SerializedName("id_amazon")
    @Expose
    private List<String> idAmazon = null;
    @SerializedName("id_paperback_swap")
    @Expose
    private List<String> idPaperbackSwap = null;
    @SerializedName("id_canadian_national_library_archive")
    @Expose
    private List<String> idCanadianNationalLibraryArchive = null;
    @SerializedName("language")
    @Expose
    private List<String> language = null;
    @SerializedName("lccn")
    @Expose
    private List<String> lccn = null;
    @SerializedName("last_modified_i")
    @Expose
    private int lastModifiedI;
    @SerializedName("lending_edition_s")
    @Expose
    private String lendingEditionS;
    @SerializedName("id_librarything")
    @Expose
    private List<String> idLibrarything = null;
    @SerializedName("cover_edition_key")
    @Expose
    private String coverEditionKey;
    @SerializedName("person")
    @Expose
    private List<String> person = null;
    @SerializedName("publish_year")
    @Expose
    private List<Integer> publishYear = null;
    @SerializedName("printdisabled_s")
    @Expose
    private String printdisabledS;
    @SerializedName("place")
    @Expose
    private List<String> place = null;
    @SerializedName("time")
    @Expose
    private List<String> time = null;
    @SerializedName("publish_date")
    @Expose
    private List<String> publishDate = null;
    @SerializedName("id_wikidata")
    @Expose
    private List<String> idWikidata = null;

    public String getTitleSuggest() {
        return titleSuggest;
    }

    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    public Doc withTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
        return this;
    }

    public List<String> getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(List<String> editionKey) {
        this.editionKey = editionKey;
    }

    public Doc withEditionKey(List<String> editionKey) {
        this.editionKey = editionKey;
        return this;
    }

    public int getCoverI() {
        return coverI;
    }

    public void setCoverI(int coverI) {
        this.coverI = coverI;
    }

    public Doc withCoverI(int coverI) {
        this.coverI = coverI;
        return this;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    public Doc withIsbn(List<String> isbn) {
        this.isbn = isbn;
        return this;
    }

    public boolean isHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public Doc withHasFulltext(boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
        return this;
    }

    public List<String> getIdDepSitoLegal() {
        return idDepSitoLegal;
    }

    public void setIdDepSitoLegal(List<String> idDepSitoLegal) {
        this.idDepSitoLegal = idDepSitoLegal;
    }

    public Doc withIdDepSitoLegal(List<String> idDepSitoLegal) {
        this.idDepSitoLegal = idDepSitoLegal;
        return this;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public Doc withText(List<String> text) {
        this.text = text;
        return this;
    }

    public List<String> getAuthorName() {
        return authorName;
    }

    public void setAuthorName(List<String> authorName) {
        this.authorName = authorName;
    }

    public Doc withAuthorName(List<String> authorName) {
        this.authorName = authorName;
        return this;
    }

    public List<String> getContributor() {
        return contributor;
    }

    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    public Doc withContributor(List<String> contributor) {
        this.contributor = contributor;
        return this;
    }

    public List<String> getIaLoadedId() {
        return iaLoadedId;
    }

    public void setIaLoadedId(List<String> iaLoadedId) {
        this.iaLoadedId = iaLoadedId;
    }

    public Doc withIaLoadedId(List<String> iaLoadedId) {
        this.iaLoadedId = iaLoadedId;
        return this;
    }

    public List<String> getSeed() {
        return seed;
    }

    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    public Doc withSeed(List<String> seed) {
        this.seed = seed;
        return this;
    }

    public List<String> getOclc() {
        return oclc;
    }

    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    public Doc withOclc(List<String> oclc) {
        this.oclc = oclc;
        return this;
    }

    public List<String> getIdGoogle() {
        return idGoogle;
    }

    public void setIdGoogle(List<String> idGoogle) {
        this.idGoogle = idGoogle;
    }

    public Doc withIdGoogle(List<String> idGoogle) {
        this.idGoogle = idGoogle;
        return this;
    }

    public List<String> getIa() {
        return ia;
    }

    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    public Doc withIa(List<String> ia) {
        this.ia = ia;
        return this;
    }

    public List<String> getAuthorKey() {
        return authorKey;
    }

    public void setAuthorKey(List<String> authorKey) {
        this.authorKey = authorKey;
    }

    public Doc withAuthorKey(List<String> authorKey) {
        this.authorKey = authorKey;
        return this;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public Doc withSubject(List<String> subject) {
        this.subject = subject;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Doc withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getLendingIdentifierS() {
        return lendingIdentifierS;
    }

    public void setLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
    }

    public Doc withLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
        return this;
    }

    public String getIaCollectionS() {
        return iaCollectionS;
    }

    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    public Doc withIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
        return this;
    }

    public int getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(int firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public Doc withFirstPublishYear(int firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Doc withType(String type) {
        this.type = type;
        return this;
    }

    public int getEbookCountI() {
        return ebookCountI;
    }

    public void setEbookCountI(int ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    public Doc withEbookCountI(int ebookCountI) {
        this.ebookCountI = ebookCountI;
        return this;
    }

    public List<String> getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(List<String> publishPlace) {
        this.publishPlace = publishPlace;
    }

    public Doc withPublishPlace(List<String> publishPlace) {
        this.publishPlace = publishPlace;
        return this;
    }

    public List<String> getIaBoxId() {
        return iaBoxId;
    }

    public void setIaBoxId(List<String> iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    public Doc withIaBoxId(List<String> iaBoxId) {
        this.iaBoxId = iaBoxId;
        return this;
    }

    public int getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(int editionCount) {
        this.editionCount = editionCount;
    }

    public Doc withEditionCount(int editionCount) {
        this.editionCount = editionCount;
        return this;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Doc withKey(String key) {
        this.key = key;
        return this;
    }

    public List<String> getIdAlibrisId() {
        return idAlibrisId;
    }

    public void setIdAlibrisId(List<String> idAlibrisId) {
        this.idAlibrisId = idAlibrisId;
    }

    public Doc withIdAlibrisId(List<String> idAlibrisId) {
        this.idAlibrisId = idAlibrisId;
        return this;
    }

    public List<String> getIdGoodreads() {
        return idGoodreads;
    }

    public void setIdGoodreads(List<String> idGoodreads) {
        this.idGoodreads = idGoodreads;
    }

    public Doc withIdGoodreads(List<String> idGoodreads) {
        this.idGoodreads = idGoodreads;
        return this;
    }

    public List<String> getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    public void setAuthorAlternativeName(List<String> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    public Doc withAuthorAlternativeName(List<String> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
        return this;
    }

    public boolean isPublicScanB() {
        return publicScanB;
    }

    public void setPublicScanB(boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    public Doc withPublicScanB(boolean publicScanB) {
        this.publicScanB = publicScanB;
        return this;
    }

    public List<String> getIdOverdrive() {
        return idOverdrive;
    }

    public void setIdOverdrive(List<String> idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    public Doc withIdOverdrive(List<String> idOverdrive) {
        this.idOverdrive = idOverdrive;
        return this;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public Doc withPublisher(List<String> publisher) {
        this.publisher = publisher;
        return this;
    }

    public List<String> getIdAmazon() {
        return idAmazon;
    }

    public void setIdAmazon(List<String> idAmazon) {
        this.idAmazon = idAmazon;
    }

    public Doc withIdAmazon(List<String> idAmazon) {
        this.idAmazon = idAmazon;
        return this;
    }

    public List<String> getIdPaperbackSwap() {
        return idPaperbackSwap;
    }

    public void setIdPaperbackSwap(List<String> idPaperbackSwap) {
        this.idPaperbackSwap = idPaperbackSwap;
    }

    public Doc withIdPaperbackSwap(List<String> idPaperbackSwap) {
        this.idPaperbackSwap = idPaperbackSwap;
        return this;
    }

    public List<String> getIdCanadianNationalLibraryArchive() {
        return idCanadianNationalLibraryArchive;
    }

    public void setIdCanadianNationalLibraryArchive(List<String> idCanadianNationalLibraryArchive) {
        this.idCanadianNationalLibraryArchive = idCanadianNationalLibraryArchive;
    }

    public Doc withIdCanadianNationalLibraryArchive(List<String> idCanadianNationalLibraryArchive) {
        this.idCanadianNationalLibraryArchive = idCanadianNationalLibraryArchive;
        return this;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public Doc withLanguage(List<String> language) {
        this.language = language;
        return this;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public Doc withLccn(List<String> lccn) {
        this.lccn = lccn;
        return this;
    }

    public int getLastModifiedI() {
        return lastModifiedI;
    }

    public void setLastModifiedI(int lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    public Doc withLastModifiedI(int lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
        return this;
    }

    public String getLendingEditionS() {
        return lendingEditionS;
    }

    public void setLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
    }

    public Doc withLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
        return this;
    }

    public List<String> getIdLibrarything() {
        return idLibrarything;
    }

    public void setIdLibrarything(List<String> idLibrarything) {
        this.idLibrarything = idLibrarything;
    }

    public Doc withIdLibrarything(List<String> idLibrarything) {
        this.idLibrarything = idLibrarything;
        return this;
    }

    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    public Doc withCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
        return this;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setPerson(List<String> person) {
        this.person = person;
    }

    public Doc withPerson(List<String> person) {
        this.person = person;
        return this;
    }

    public List<Integer> getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(List<Integer> publishYear) {
        this.publishYear = publishYear;
    }

    public Doc withPublishYear(List<Integer> publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public String getPrintdisabledS() {
        return printdisabledS;
    }

    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    public Doc withPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
        return this;
    }

    public List<String> getPlace() {
        return place;
    }

    public void setPlace(List<String> place) {
        this.place = place;
    }

    public Doc withPlace(List<String> place) {
        this.place = place;
        return this;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public Doc withTime(List<String> time) {
        this.time = time;
        return this;
    }

    public List<String> getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(List<String> publishDate) {
        this.publishDate = publishDate;
    }

    public Doc withPublishDate(List<String> publishDate) {
        this.publishDate = publishDate;
        return this;
    }

    public List<String> getIdWikidata() {
        return idWikidata;
    }

    public void setIdWikidata(List<String> idWikidata) {
        this.idWikidata = idWikidata;
    }

    public Doc withIdWikidata(List<String> idWikidata) {
        this.idWikidata = idWikidata;
        return this;
    }

}
