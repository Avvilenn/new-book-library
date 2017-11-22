package online.book.library.dao;

import online.book.library.domain.Book;

public interface BookUploadDao {
    void save(Book book);
}
