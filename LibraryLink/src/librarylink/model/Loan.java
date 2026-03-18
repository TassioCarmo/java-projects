package librarylink.model;
import java.time.LocalDate;

public class Loan {

    // --- Fields ---
    private Book book;
    private Member member;
    private String loanID;
    private LocalDate loanBorrowDate;
    private LocalDate loanReturnDate;
    private boolean isReturned;

    // --- Constructor ---
    public Loan(String loanID, Book book, Member member, LocalDate loanBorrowDate, LocalDate loanReturnDate) {
        this.loanID = loanID;
        this.book = book;
        this.member = member;
        this.loanBorrowDate = loanBorrowDate;
        this.loanReturnDate = loanReturnDate;
        this.isReturned = false;
    }

    // --- Getters ---
    public String getLoanID() {
        return loanID;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getLoanBorrowDate() {
        return loanBorrowDate;
    }

    public LocalDate getLoanReturnDate() {
        return loanReturnDate;
    }

    public boolean isReturned() {
        return isReturned;
    }
    
    // --- Setters ---

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public void setLoanReturnDate(LocalDate loanReturnDate) {
        this.loanReturnDate = loanReturnDate;
    }

    // --- Methods ---

    //  --- toString ---

    @Override
    public String toString() {
        return "Loan{" +
                "loanID='" + loanID + '\'' +
                ", book=" + book.getTitle() +
                ", member=" + member.getName() +
                ", loanBorrowDate=" + loanBorrowDate +
                ", loanReturnDate=" + loanReturnDate +
                ", isReturned=" + isReturned +
                '}';
    }


    
}
