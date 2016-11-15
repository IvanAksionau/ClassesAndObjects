package solution4.comporators;

import solution4.app.Book;

import java.util.Comparator;

/**
 * Created by Ivan on 26.09.2016.
 */
public class BookComparators {

    private static final Comparator<Book> bookTitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    public static final Comparator<Book> bookTitleThenAuthorComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int result = o1.getTitle().compareTo(o2.getTitle());
            if (result != 0) return result;
            result = o1.getAuthor().compareTo(o2.getAuthor());
            return result != 0 ? result : 0;
        }
    };

    private static final Comparator<Book> bookAuthorThenTitleComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int result = o1.getAuthor().compareTo(o2.getAuthor());
            if (result != 0) return result;
            result = o1.getTitle().compareTo(o2.getTitle());
            return result != 0 ? result : 0;
        }
    };

    private static final Comparator<Book> bookAuthorThenTitleThenPriceComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            int result = o1.getAuthor().compareTo(o2.getAuthor());
            if (result != 0) return result;
            result = o1.getTitle().compareTo(o2.getTitle());
            if (result != 0) return result;
            result = o1.getPrice() - o2.getPrice();
            return result != 0 ? result : 0;
        }
    };

    public static Comparator<Book> getBookTitleComparator() {
        return bookTitleComparator;
    }

    public static Comparator<Book> getBookTitleThenAuthorComparator() {
        return bookTitleThenAuthorComparator;
    }

    public static Comparator<Book> getBookAuthorThenTitleComparator() {
        return bookAuthorThenTitleComparator;
    }

    public static Comparator<Book> getBookAuthorThenTitleThenPriceComparator() {
        return bookAuthorThenTitleThenPriceComparator;
    }

}
