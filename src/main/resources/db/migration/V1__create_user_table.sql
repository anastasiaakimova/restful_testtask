CREATE TABLE IF NOT EXISTS cars.usr
(   id SERIAL PRIMARY KEY,
    password character varying(255) NOT NULL,
    username character varying(255) NOT NULL,
    active   bit(1)
);