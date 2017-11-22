CREATE DATABASE mybooks;

CREATE TABLE books (
  book_id int(11) NOT NULL AUTO_INCREMENT,
  book_title varchar(128) DEFAULT NULL,
  book_body longblob,
  PRIMARY KEY (book_id)
);
