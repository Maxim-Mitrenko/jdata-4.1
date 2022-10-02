create table user
(
    name varchar(255),
    surname varchar(255),
    age int check (age > 0),
    phone_number varchar(255),
    city varchar(255),
    PRIMARY KEY (name, surname, age)
);

INSERT INTO user VALUES ('Иван', 'Иванов', 25, '+79999992123', 'MOSCOW');
INSERT INTO user VALUES('Петр', 'Сергеев', 29, '+79999992123', 'VOLGOGRAD');
INSERT INTO user VALUES ('Иван', 'Петров', 31, '+79999992123', 'MOSCOW');
INSERT INTO user VALUES ('Лев', 'Андреев', 35, '+79999992123', 'MOSCOW');