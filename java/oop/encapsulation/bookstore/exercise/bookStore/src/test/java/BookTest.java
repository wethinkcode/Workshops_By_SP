import org.example.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testGetTitle() {
        // Create a book instance
        Book book = new Book("Sample Book", "John Doe", 29.99);

        // Test getting the title
        assertEquals("Sample Book", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        // Create a book instance
        Book book = new Book("Sample Book", "John Doe", 29.99);

        // Test getting the author
        assertEquals("John Doe", book.getAuthor());
    }

    @Test
    public void testGetPrice() {
        // Create a book
        Book book = new Book("Sample Book", "John Doe", 29.99);

        // Test getting the price
        assertEquals(29.99, book.getPrice(), 0.001);  // Using a delta for double comparison
    }


}
