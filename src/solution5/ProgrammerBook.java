package solution5;

import solution4.app.Book;


/**
 * Created by Ivan_Aksionau on 9/22/2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;


    public ProgrammerBook(String title, String author, int price, String language, int level,int isbn) {
        super(title, author, price,isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString() {
        return this.getClass() + " - " + getTitle() + " (" + getAuthor() + ")" + " for " + level
                + " level " + " in " + language + "language" + "price is" + getPrice();
    }

    @Override
    public int hashCode() {
        return 31 *  getPrice() * getEdition() + 1;
    }

    @Override
    public boolean equals(Object book) {
        if (this == book)
            return true;
        if (book == null)
            return false;
        if (getClass() != book.getClass())
            return false;
        ProgrammerBook other = (ProgrammerBook) book;
        if (getTitle() != other.getTitle())
            return false;
        if (getAuthor() != other.getAuthor())
            return false;
        if (getPrice() != other.getPrice())
            return false;
        if (language != other.language)
            return false;
        if (level != other.level)
            return false;
        return true;
    }
}
