CREATE TABLE Person (
    id integer,
    age smallint,
    birthDate date,
    cpf varchar(255),
    email varchar(255),
    name varchar(255),
    primary key (id)
);

CREATE TABLE Product (
    id integer,
    name varchar(255),
    price float not null,
    quantity integer,
    status boolean not null,
    primary key (id)
);