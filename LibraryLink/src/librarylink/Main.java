package librarylink;
import librarylink.model.Book;
import librarylink.model.Loan;
import librarylink.model.Member;
import java.time.LocalDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book(
            "Dune",
            "Frank Herbert",
            "978-0441013593",
            "Sci-Fi",
            1965
        );

        books[1] = new Book(
            "1984",
            "George Orwell",
            "978-0451524935",
            "Dystopian",
            1949
        );

        books[2] = new Book(
            "The Hobbit",
            "J.R.R. Tolkien",
            "978-0547928227",
            "Fantasy",
            1937
        );

        Member memberTest1 = new Member(
            "M001",
            "John Doe",
            "john@email.com",
            "11999999999"
        );

        Member memberTest2 = new Member(
            "M002",
            "Jane Smith",
            "jane@email.com",
            "11888888888"
        );


        Loan loanTest = new Loan(
            "L001",
            books[0],
            memberTest1,
            LocalDate.now(),
            LocalDate.now().plusDays(14)
        );


        System.out.println("Welcome to LibraryLink!");

        for (Book book : books) {
            System.out.println(book.toString());
        }

        memberTest1.addBorrowedBook(books[0]);
        System.out.println(memberTest1.getBorrowedBooksCount());
        System.out.println(loanTest);

    }
    
}
