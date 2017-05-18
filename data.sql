
DROP TABLE customer IF EXISTS;
CREATE TABLE customer
(
    id int(10) not null,
    name varchar(100),
    email varchar(100),
);

insert into customer(id,name,email) values 
(1, 'Prashanth Munigala', 'pra@hertz.com'),
(2, 'Shravan Mulug', 'shravan@hertz.com'),
(3, 'Subba Ch', 'subba@hertz.com'),
(4, 'Hari U', 'hari@hertz.com');
