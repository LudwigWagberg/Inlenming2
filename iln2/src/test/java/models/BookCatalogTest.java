package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        Book book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @org.junit.Test
    public void testAddABook() {
        BookCatalog bookCatalog = new BookCatalog();
        Book book = new Book(1, "Learning Java", "", "", "", 0);
        bookCatalog.addBook(book);

        assertArrayEquals(bc.getBookArray(), bookCatalog.getBookArray());
        assertEquals(1, bookCatalog.getNumberOfBooks());
    }

    //G
    @Test
    public void testFindBook() {

        try {
            BookCatalog bookCatalog = new BookCatalog();
            Book book1 = new Book(1, "Title1", "", "", "", 0);
            Book book2 = new Book(2, "Title2", "", "", "", 0);

            bookCatalog.addBook(book1);
            bookCatalog.addBook(book2);

            Book findBook1 = bookCatalog.findBook("Title1");
            Book findBook2 = bookCatalog.findBook("Title2");

            assertEquals(book1, findBook1);
            assertEquals(book2, findBook2);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }

    //G
    @Test
    public void testFindBookIgnoringCase() {

        try {
            BookCatalog bookCatalog = new BookCatalog();

            Book book1 = new Book(1, "TitLe1", "", "", "", 0);
            bookCatalog.addBook(book1);

            Book findBookIgnoreCase = bookCatalog.findBook("title1");

            assertNotNull(findBookIgnoreCase);
            assertEquals(book1, findBookIgnoreCase);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        try {
            BookCatalog bookCatalog = new BookCatalog();

            Book book1 = new Book(1, "Title1", "", "", "", 0);
            bookCatalog.addBook(book1);

            Book findBookWithSpace = bookCatalog.findBook("   Title1");

            assertNotNull(findBookWithSpace);
            assertEquals(book1, findBookWithSpace);
        } catch (BookNotFoundException e) {
            e.printStackTrace();
        }

    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {

    }

}
