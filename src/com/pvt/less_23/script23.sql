CREATE DATABASE books23;
USE books23;
# drop table books;
# DROP TABLE authors;
# DROP DATABASE books;
SHOW TABLES;

CREATE TABLE authors23 (
  id_author  INT(10) AUTO_INCREMENT,
  first_name VARCHAR(20) NOT NULL,
  date_birth INT(20)     NOT NULL,
  country    VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_author)
);

CREATE TABLE books23 (
  id_book   INT(10) AUTO_INCREMENT,
  name      VARCHAR(20) NOT NULL,
  ganr      VARCHAR(20) NOT NULL,
  pages     INT(4),
  id_author INT(10),
  PRIMARY KEY (id_book),
  FOREIGN KEY (id_author) REFERENCES authors23 (id_author)
);

# INSERT INTO authors VALUES ('1', 'aleksandr', 'pushkin', 'russia');
INSERT INTO authors23 (first_name, date_birth, country) VALUES ('aleksandrh', '1900', 'russia');
INSERT INTO authors23 (first_name, date_birth, country) VALUES ('michail', '1800', 'russia');
INSERT INTO authors23 (first_name, date_birth, country) VALUES ('vasilij', '1850', 'belarus');
INSERT INTO authors23 (first_name, date_birth, country) VALUES ('jakub', '1950', 'belarus');
INSERT INTO authors23 (first_name, date_birth, country) VALUES ('sergei', '1900', 'russia');


INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name1', 'ganr1', '0001', '1');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name1', 'ganr1', '0001', '2');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name2', 'ganr2', '0002', '1');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name2', 'ganr2', '0002', '2');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name3', 'ganr3', '0003', '3');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name4', 'ganr4', '0004', '4');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name5', 'ganr5', '0005', '5');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name6', 'ganr6', '0006', '1');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name7', 'ganr7', '0007', '2');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name8', 'ganr8', '0008', '3');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name9', 'ganr9', '0009', '4');
INSERT INTO books23 (name, ganr, pages, id_author) VALUES ('name10', 'ganr10', '0010', '5');

SELECT *
FROM authors23;
SELECT *
FROM books23;

# 1.	Выбрать из базы данных имена авторов с названиями написанных ими книг.
# Назвать поля результирующей таблицы book_author и book_name.

SELECT
  a.first_name AS book_author,
  b.name       AS book_name
FROM books23 b
  JOIN authors23 a ON b.id_author = a.id_author;

# 2.	Выбрать из таблицы все книги авторов выбранной национальности.

SELECT
  b.name AS book_name,
  a.country
FROM books23 b
  JOIN authors23 a ON b.id_author = a.id_author
WHERE country = 'belarus';

# 3.	Выбрать из таблицы все книги, авторы которых родились после 1900 года.
SELECT
  b.name AS book_name,
  a.date_birth
FROM books23 b
  JOIN authors23 a ON b.id_author = a.id_author
WHERE date_birth < '1900';

# 4.	Удалить из таблицы данных книгу с заданным названием.

DELETE FROM books23
WHERE name = 'name9';

# 5.	Выбрать из таблицы: имя автора, национальность и среднее количество написанных им страниц, упорядочить по году рождения автора.

SELECT
  a.first_name,
  a.country,
  (avg(pages))
FROM books23 b
  JOIN authors23 a ON b.id_author = a.id_author
GROUP BY first_name
ORDER BY a.date_birth;

# 6.	Выбрать из таблицы: имя автора, национальность и среднее количество написанных им страниц, где среднее число страниц больше 300.

SELECT
  a.first_name,
  a.country,
  avg(pages) AS page
FROM books23 b
  JOIN authors23 a ON b.id_author = a.id_author
GROUP BY first_name
HAVING page >= 4;


