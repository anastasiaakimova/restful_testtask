CREATE TABLE IF NOT EXISTS user
(   id SERIAL PRIMARY KEY,
    password character varying(255) NOT NULL,
    username character varying(255) NOT NULL,
    active   bit(1)
);