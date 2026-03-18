### Why does Loan hold a reference to a Book object instead of just storing the book's title as a String?

-  referential integrity + single source of truth.
-  If Loan only stored String title, then:The title in the Loan could become outdated (someone changes the book title later).
-  You lose access to all other book data (author, ISBN, availability, year, etc.).
-  When the book is returned, you wouldn’t know which exact Book object to set isAvailable = true on.




### What would break if you made borrowedBooks in Member a public field instead of private with a getter?

- Never make mutable collections public.
- You lose control
- methods currently enforce rules (e.g. you could later add "max 5 books" check).


### Could one Loan object reference two different books? Should it? What would you change in the design if a member could borrow multiple books in a single transaction?

- No, one Loan object cannot (and should not) reference two different books.
- A Loan represents one borrowing transaction for one book.
That’s why it has exactly one Book reference.



