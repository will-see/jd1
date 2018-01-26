CREATE DATABASE books;
USE books;
# drop table books;
DROP TABLE authors;
DROP DATABASE books;
SHOW TABLES;

CREATE TABLE authors (
  id_author   INT(10) AUTO_INCREMENT,
  first_name  VARCHAR(20) NOT NULL,
  second_name VARCHAR(20) NOT NULL,
  country     VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_author)
);

CREATE TABLE books (
  id_book   INT(10) AUTO_INCREMENT,
  name      VARCHAR(20) NOT NULL,
  ganr      VARCHAR(20) NOT NULL,
  year      INT(4)      NOT NULL,
  id_author INT(10)     NOT NULL,
  PRIMARY KEY (id_book),
  FOREIGN KEY (id_author) REFERENCES authors (id_author)
);


INSERT INTO authors VALUES ('1', 'aleksandr', 'pushkin', 'russia');
INSERT INTO authors (first_name, second_name, country) VALUES ('michail', 'lermontov', 'russia');
INSERT INTO authors (first_name, second_name, country) VALUES ('vasilij', 'bykov', 'belarus');
INSERT INTO authors (first_name, second_name, country) VALUES ('jakub', 'kolos', 'belarus');
INSERT INTO authors (first_name, second_name, country) VALUES ('sergei', 'esenin', 'russia');


INSERT INTO books (name, ganr, year, id_author) VALUES ('name1', 'ganr1', '0001', '1');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name2', 'ganr2', '0002', '2');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name3', 'ganr3', '0003', '3');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name4', 'ganr4', '0004', '4');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name5', 'ganr5', '0005', '5');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name6', 'ganr6', '0006', '1');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name7', 'ganr7', '0007', '2');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name8', 'ganr8', '0008', '3');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name9', 'ganr9', '0009', '4');
INSERT INTO books (name, ganr, year, id_author) VALUES ('name10', 'ganr10', '0010', '5');

SELECT *FROM authors;
SELECT *FROM books;


# 4. Написать запрос, выбирающий: название книги и имя автора, отсортированные по году издания книги в возрастающем порядке.
SELECT b.name, a.first_name FROM books b JOIN authors a ON b.id_author = a.id_author order by year;
SELECT b.name, a.first_name FROM books b JOIN authors a ON b.id_author = a.id_author order by year DESC;

# 5. Написать запрос, выбирающий количество книг у заданного автора.
SELECT b.name, a.first_name FROM books b JOIN authors a ON b.id_author = a.id_author WHERE a.id_author=1;
SELECT count(name) AS books_count FROM books b JOIN authors a ON b.id_author = a.id_author WHERE a.second_name = 'pushkin';

