SHOW DATABASES;

# DROP DATABASE countries;
create database countries;
USE countries;
create table countries (
  country VARCHAR (20),
  peoples FLOAT(10),
  area FLOAT(10),
  language VARCHAR(20));

EXPLAIN countries;
SELECT *from countries;

insert into countries values  ('Belarus','9.5','0.56','belarusian');
insert into countries (country,peoples,area,language) values
  ('Russia','501','1000.3','russian'),
  ('Poland','15.5','1.12','polish'),
  ('Ukraine','21.6','10.57','ukrine'),
  ('German','20.5','6.32','german'),
  ('Italy','8.3','2.44','italian'),
  ('China','1300.2','21.65','chinise'),
  ('Brazyl','80.5','8.34','brazyl'),
  ('Japan','65.2','3.12','japane'),
  ('UAE','10.7','6.88','arabic');
insert into countries values  ('Bigest','5000','5000','lang');

# 3.	Написать запрос, выбирающий из таблицы все страны с населением выше 50 млн. человек
select *from countries where peoples>50;

# 4.	Написать запрос, выбирающий из таблицы все страны, отсортированные по возрастанию численности населения.
select * from countries order by peoples;

# 5.	Написать запрос, выбирающий из таблицы суммарное население пяти самых маленьких стран.
select *from countries order by area LIMIT 5 ;
select sum(peoples) from (select *from countries order by area LIMIT 5) as sum;

# 6.	Написать запрос, заменяющий государственный язык одной из стран на другой.
update countries set language = 'brazylian' where language='brazyl';

# 7.	Написать запрос, удаляющий страну с наибольшим населением.
select max(peoples) from countries;
# delete from countries where peoples = (select max(peoples) from countries);
DELETE FROM countries WHERE peoples=(SELECT size from (SELECT MAX(peoples) as size FROM countries) as maxC);