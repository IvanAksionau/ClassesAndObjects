import org.junit.Before;
import org.junit.Test;
import solution4.app.Book;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ivan on 27.09.2016.
 */
public class BookComparableTest {
    ArrayList<Integer> sortedIsbnNumbers;

    @Before
    public void setSortedIsbnNumbers() {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Title1", "Author 1", 25, 11));
        books.add(new Book("Title2", "Author 2", 19, 4));
        books.add(new Book("Title3", "Author 3", 3, 9));
        books.add(new Book("Title4", "Author 4", 7, 1));

        sortedIsbnNumbers = new ArrayList<>();
        for (Book book : books) {
            sortedIsbnNumbers.add(book.getIsbn());
        }
    }

    @Test
    public void compareTo() throws Exception {
        for (int i = 0; i < sortedIsbnNumbers.size() - 1; i++) {
            assertTrue(sortedIsbnNumbers.get(i) <= sortedIsbnNumbers.get(i + 1));
        }
    }


}