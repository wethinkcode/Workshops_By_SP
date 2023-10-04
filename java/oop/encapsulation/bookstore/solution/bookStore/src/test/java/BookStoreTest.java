import org.example.Book;
import org.example.BookStore;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookStoreTest {


    private BookStore bookstore;

    @Before
    public void setUp() {
        // Create a new Bookstore instance before each test
        bookstore = new BookStore();
    }

    @Test
    public void testAddBook() {
        // Create a book
        Book book = new Book("Sample Book", "John Doe", 29.99);

        // Add the book to the bookstore
        bookstore.addBook(book);

        // Retrieve all books from the bookstore
        List<Book> books = bookstore.getAllBooks();

        // Verify that the bookstore contains the added book
        assertTrue(books.contains(book));
    }

    @Test
    public void testGetAllBooks() {
        // Initially, the bookstore should have no books
        List<Book> books = bookstore.getAllBooks();
        assertEquals(0, books.size());

        // Create and add two books to the bookstore
        Book book1 = new Book("Book 1", "Author 1", 19.99);
        Book book2 = new Book("Book 2", "Author 2", 24.99);
        bookstore.addBook(book1);
        bookstore.addBook(book2);

        // Retrieve all books from the bookstore
        books = bookstore.getAllBooks();

        // Verify that the bookstore contains both books
        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }

    @Test
    public void testCalculateTotalPrice() {
        // Initially, the total price should be zero
        assertEquals(0.0, bookstore.calculateTotalPrice(), 0.001);

        // Create and add two books to the bookstore
        Book book1 = new Book("Book 1", "Author 1", 19.99);
        Book book2 = new Book("Book 2", "Author 2", 24.99);
        bookstore.addBook(book1);
        bookstore.addBook(book2);

        // Calculate the total price of books in the bookstore
        double totalPrice = bookstore.calculateTotalPrice();

        // Verify that the total price is the sum of book prices
        assertEquals(44.98, totalPrice, 0.001);  // Using a delta for double comparison
    }
}

// public class Person {
//     private String name;
//     // ... rest of the class
// }

// import java.lang.reflect.Field;
// import org.junit.Test;
// import static org.junit.Assert.*;

// public class PersonTest {
//     @Test
//     public void testNameFieldIsPrivate() throws NoSuchFieldException {
            // Tests to see if the class attribure 'name' has been set to private
//         Field nameField = Person.class.getDeclaredField("name");
//         assertTrue(java.lang.reflect.Modifier.isPrivate(nameField.getModifiers()));
//     }

//     @Test
//     public void testGetName() {
            // Tests to see if the getter works correctly by returning the expected name
//         Person person = new Person();
//         person.setName("John");
//         assertEquals("John", person.getName());
//     }

//     @Test
//     public void testSetName() {
            // // Tests to see if the Setter works correctly by setting the expected name
//         Person person = new Person();
//         person.setName("John");

//         // Using reflection to get the value of the name field without the getName() method
//         Field nameField = Person.class.getDeclaredField("name");
//         nameField.setAccessible(true); // You need this line to access a private field
//         String nameValue = (String) nameField.get(person);

//         assertEquals("John", nameValue);
//     }
// }

