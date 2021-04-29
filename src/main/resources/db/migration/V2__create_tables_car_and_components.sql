CREATE TABLE IF NOT EXISTS cars.drive
(
    id   bigserial              NOT NULL,
    type character varying(255) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE cars.drive
    OWNER to root;

INSERT INTO cars.drive (id, type)
VALUES ('1'::bigint, 'REAR'::character varying);
VALUES ('2'::bigint, 'FRONT'::character varying);
VALUES ('3'::bigint, 'FULL'::character varying);

CREATE TABLE IF NOT EXISTS cars.transmission
(
    id   bigserial              NOT NULL,
    type character varying(255) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE cars.transmission
    OWNER to root;

INSERT INTO cars.transmission (id, type)
VALUES ('1'::bigint, 'AUTOMATIC'::character varying);
VALUES ('2'::bigint, 'MECHANICS'::character varying);

CREATE TABLE IF NOT EXISTS cars.engine
(
    id   bigserial              NOT NULL,
    type character varying(255) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE cars.engine
    OWNER to root;

INSERT INTO cars.engine (id, type)
VALUES ('1'::bigint, 'PETROL'::character varying);
VALUES ('2'::bigint, 'GAS'::character varying);
VALUES ('3'::bigint, 'HYBRID'::character varying);
VALUES ('4'::bigint, 'DIESEL'::character varying);
VALUES ('5'::bigint, 'ELECTRO'::character varying);

CREATE TABLE IF NOT EXISTS cars.body
(
    id   bigserial              NOT NULL,
    type character varying(255) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE cars.body
    OWNER to root;

INSERT INTO cars.body (id, type)
VALUES ('1'::bigint, 'SUV'::character varying);
VALUES ('2'::bigint, 'CABRIOLET'::character varying);
VALUES ('3'::bigint, 'COUPE'::character varying);
VALUES ('4'::bigint, 'LIFTBACK'::character varying);
VALUES ('5'::bigint, 'MINIVAN'::character varying);
VALUES ('6'::bigint, 'PICKUP'::character varying);
VALUES ('7'::bigint, 'SEDAN'::character varying);
VALUES ('8'::bigint, 'UNIVERSAL'::character varying);
VALUES ('9'::bigint, 'VAN'::character varying);
VALUES ('10'::bigint, 'HATCHBACK'::character varying);


CREATE TABLE IF NOT EXISTS cars.car
(
    id           SERIAL PRIMARY KEY,
    brand        character varying(255) NOT NULL,
    carModel     character varying(255) NOT NULL,
    generation   character varying(255) NOT NULL,
    year         date,
    transmission integer,
    drive        integer,
    engine       integer,
    volume       numeric(2, 1),
    body         integer,
    price        numeric(8, 3),
    FOREIGN KEY (transmission) REFERENCES cars.transmission (id),
    FOREIGN KEY (drive) REFERENCES cars.drive (id),
    FOREIGN KEY (engine) REFERENCES cars.engine (id),
    FOREIGN KEY (body) REFERENCES cars.body (id)
);

