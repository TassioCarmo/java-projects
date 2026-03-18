package librarylink.model;

public class Book {

    // --- Fields ---
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private int yearPublished;
    private boolean isAvailable;

    // --- Constructor ---
    public Book(String title, String author, String isbn, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }
    
    // --- Getters ---
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    } 
    public String getGenre() {
        return genre;
    }
    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // --- Setters ---
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }


    @Override
    public String toString() {
        return "Book:\n" +
            "ISBN=" + isbn + ",\n" +
            "Title=" + title + ",\n" +
            "Author=" + author + ",\n" +
            "Available=" + isAvailable;
    }
}
