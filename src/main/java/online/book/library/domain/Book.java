package online.book.library.domain;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
public class Book {
    private long id;
    private String bookTitle;
    private byte[] bookText;

    @Id
    @GeneratedValue
    @Column(name = "book_id")
    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    @Column(name = "book_title")
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(final String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Column(name = "book_body")
    public byte[] getBookText() {
        return bookText;
    }

    public void setBookText(final byte[] bookText) {
        this.bookText = bookText;
    }

    public Book() {
    }

    public Book(final String bookTitle, final byte[] bookText) {
        this.bookTitle = bookTitle;
        this.bookText = bookText;
    }
}
