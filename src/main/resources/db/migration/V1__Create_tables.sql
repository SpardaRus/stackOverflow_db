CREATE TABLE product_entity
(
    id           bigint NOT NULL,
    product_name character varying(255),
    product_code bigint,
    bare_code    bigint,
    produce      character varying(255),
    type         character varying(255),
    price        bigint
);

CREATE TABLE suppliers
(
    id         bigint NOT NULL,
    company    character varying(255),
    inn        bigint,
    product_id bigint NOT NULL
);

insert into product_entity
values (2, 'Аспирин', 124, 123456789, 'БАЙЕР', 'Лекарства', 432);

insert into suppliers
values (1, 'ООО Байер', 7704017596, 2);