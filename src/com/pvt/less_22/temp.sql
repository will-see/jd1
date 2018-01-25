CREATE DATABASE temp;
USE temp;

create table users (
  id_user int (10) AUTO_INCREMENT,
  name varchar(20) NOT NULL,
  email varchar(50) NOT NULL,
  password varchar(15) NOT NULL,
  PRIMARY KEY (id_user)
);

create table topics (
  id_topic int (10) AUTO_INCREMENT,
  topic_name varchar(100) NOT NULL,
  id_author int (10) NOT NULL,
  PRIMARY KEY (id_topic),
  FOREIGN KEY (id_author) REFERENCES users (id_user)
);

create table posts (
  id_post int (10) AUTO_INCREMENT,
  message text NOT NULL,
  id_author int (10) NOT NULL,
  id_topic int (10) NOT NULL,
  PRIMARY KEY (id_post),
  FOREIGN KEY (id_author) REFERENCES users (id_user),
  FOREIGN KEY (id_topic) REFERENCES topics (id_topic)
);
SHOW TABLES ;
INSERT INTO users VALUES ('1','sergey', 'sergey@mail.ru', '1111');
INSERT INTO users (name, email, password) VALUES ('valera', 'valera@mail.ru', '2222');
SELECT  *FROM users;