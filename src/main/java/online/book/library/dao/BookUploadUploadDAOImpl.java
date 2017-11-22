package online.book.library.dao;

import online.book.library.domain.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookUploadUploadDAOImpl implements BookUploadDao {

    @PersistenceContext
    private EntityManager entityManager;

    public BookUploadUploadDAOImpl() {
    }


    @Override
    @Transactional
    public void save(final Book book) {
       entityManager.persist(book);
    }
}
