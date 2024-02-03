package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "book test", "milo", "999-000", "none", 347);
		Book book2 = new Book(1, "book test", "milo", "999-000", "none", 347);

		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Return of the king", "Neeko", "8321-332", "none", 3471);
		Book book2 = new Book(2, "Lord", "JJ", "0239-023", "none", 8743);

		assertNotEquals(book1, book2);
	}

}
