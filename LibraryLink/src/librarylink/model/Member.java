package librarylink.model;
import java.util.ArrayList;
import java.util.List;


public class Member {
    // --- Fields ---
    private String memberID;
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Book> borrowedBooks;

    // --- Constructor ---
    public Member(String memberID, String name, String email, String phoneNumber) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }


    // --- Getters ---
    public String getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // --- Setters ---

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // --- Methods ---
    public void addBorrowedBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book) {
        this.borrowedBooks.remove(book);
    }

    public int getBorrowedBooksCount() {
        return this.borrowedBooks.size();
    }

    public boolean hasBorrowedBook(Book book) {
        return this.borrowedBooks.contains(book);
    }

    // --- toString ---
    @Override
    public String toString() {
        return "Member{" +
                "memberID='" + memberID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", borrowedBooks=" + borrowedBooks.size() +
                '}';
    }

    
}
