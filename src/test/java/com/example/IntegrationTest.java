package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceIntegrationTest {

    @Test
    void shouldBorrowBookCorrectly() {
        LibraryService service = new LibraryService();

        Book book = new Book("123", "Clean Code");
        User user = new User("u1", "Ana");

        service.addBook(book);
        service.addUser(user);

        Loan loan = service.borrowBook("123", "u1");

        assertNotNull(loan);
        assertEquals(book, loan.getBook());
        assertEquals(user, loan.getUser());
        assertFalse(book.isAvailable());
        assertEquals(1, user.getLoans().size());
        assertTrue(user.getLoans().contains(loan));
        assertTrue(loan.isActive());
    }

    @Test
    void noLoan() {
        LibraryService service=new LibraryService();

        Book book=new Book("123","Clean Code");
        User user=new User("u1","Ana");

        service.addBook(book);
        service.addUser(user);

        service.borrowBook("123","u1");

        assertThrows(RuntimeException.class,()->service.borrowBook("123","u1"));
    }

    @Test
    void maxTresLoans() {
        LibraryService service=new LibraryService();

        User user=new User("u1","Ana");
        service.addUser(user);

        Book b1=new Book("1","A");
        Book b2=new Book("2","B");
        Book b3=new Book("3","C");
        Book b4=new Book("4","D");

        service.addBook(b1);
        service.addBook(b2);
        service.addBook(b3);
        service.addBook(b4);

        service.borrowBook("1","u1");
        service.borrowBook("2","u1");
        service.borrowBook("3","u1");

        assertThrows(RuntimeException.class,()->service.borrowBook("4","u1"));
    }

    @Test
    void devolverOk() {
        LibraryService service=new LibraryService();

        Book book=new Book("123","Clean Code");
        User user=new User("u1","Ana");

        service.addBook(book);
        service.addUser(user);

        Loan loan=service.borrowBook("123","u1");
        service.returnBook(loan);

        assertFalse(loan.isActive());
        assertTrue(book.isAvailable());
    }

    @Test
    void noDobleDevolucion() {
        LibraryService service=new LibraryService();

        Book book=new Book("123","Clean Code");
        User user=new User("u1","Ana");

        service.addBook(book);
        service.addUser(user);

        Loan loan=service.borrowBook("123","u1");
        service.returnBook(loan);

        assertThrows(RuntimeException.class,()->service.returnBook(loan));
    }

    @Test
    void userDoble() {
        LibraryService service=new LibraryService();

        User user=new User("u1","Ana");

        service.addUser(user);

        assertThrows(RuntimeException.class,()->service.addUser(user));
    }

    @Test
    void libroDoble() {
        LibraryService service=new LibraryService();

        Book book=new Book("123","Clean Code");

        service.addBook(book);

        assertThrows(RuntimeException.class,()->service.addBook(book));
    }

    @Test
    void libroFalso() {
        LibraryService service=new LibraryService();
        User user=new User("u1","Ana");

        service.addUser(user);

        assertThrows(RuntimeException.class,()->service.borrowBook("999","u1"));
    }

    @Test
    void userFalso() {
        LibraryService service=new LibraryService();
        Book book=new Book("123","Clean Code");

        service.addBook(book);

        assertThrows(RuntimeException.class,()->service.borrowBook("123","u9"));
    }

    @Test
    void userInvalido() {
        LibraryService service=new LibraryService();
        Book book=new Book("123","Clean Code");
        User user=new User("u1","Ana");

        service.addBook(book);
        service.addUser(user);

        service.borrowBook("123","u1");

        assertThrows(RuntimeException.class,()->service.borrowBook("123","u1"));
    }

    @Test
    void getterUser() {
        User user=new User("u1","Ana");
        assertEquals("Ana",user.getName());
    }

    @Test
    void getterBook() {
        Book book=new Book("123","Clean Code");
        assertEquals("Clean Code",book.getTitle());
    }

    @Test
    void getterFecha() {
        LibraryService service=new LibraryService();

        Book book=new Book("123","Clean Code");
        User user=new User("u1","Ana");

        service.addBook(book);
        service.addUser(user);

        Loan loan=service.borrowBook("123","u1");

        assertNotNull(loan.getStartDate());
    }
}