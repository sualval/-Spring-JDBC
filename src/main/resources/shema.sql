create table if not exists customers
(
    id           serial primary key,
    name         varchar(50) not null,
    surname      varchar(50) not null,
    age          integer     not null,
    phone_number varchar(50)
);

create table if not exists orders
(
    id           serial PRIMARY KEY,
    date         date,
    customer_id  int REFERENCES customers (id),
    product_name varchar(50) not null,
    amount       int
);