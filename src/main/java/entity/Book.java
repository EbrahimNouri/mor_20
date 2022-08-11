package entity;

public class Book {

    private String title;
    private String author;
    private long isbn;
    private boolean publication;

    public Book(String title, String author, int isbn, boolean publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public boolean isPublication() {
        return publication;
    }

    public void setPublication(boolean publication) {
        this.publication = publication;
    }
}
