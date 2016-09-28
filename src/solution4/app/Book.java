package solution4.app;

/**
 * Created by Ivan_Aksionau on 9/22/2016.
 */
public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;//при создании обьекта класса Book - edition++
    private int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        edition++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return new Book(this.title, this.author, this.price, this.isbn);
    }

    @Override
    public String toString() {
        return this.getClass() + " - " + title + " (" + author + ")" + "price is" + price;
    }

    @Override
    public int hashCode() {
        return  31 + price * edition + 1;
    }

    @Override
    public boolean equals(Object book) {
        if (this == book)
            return true;
        if (book == null)
            return false;
        if (getClass() != book.getClass())
            return false;
        Book other = (Book) book;
        if (title != other.title)
            return false;
        if (author != other.author)
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public int compareTo(Book o) {
        int result = 0;
        if (isbn == o.getIsbn()) result = 0;
        if (isbn < o.getIsbn()) result = -1;
        if (isbn > o.getIsbn()) result = 1;
        return result;
    }
}
