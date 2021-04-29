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