create table car_models
(
    id           int          not null
        primary key,
    model        varchar(256) null,
    shop_info_id int          null,
    price        int          null,
    constraint car_models_ibfk_1
        foreign key (shop_info_id) references shop_info (id)
);

create index shop_info_id
    on car_models (shop_info_id);

INSERT INTO test_db.car_models (id, model, shop_info_id, price) VALUES (1, 'OPEL', 1, 50000);
INSERT INTO test_db.car_models (id, model, shop_info_id, price) VALUES (2, 'BMW', 2, 40000);
INSERT INTO test_db.car_models (id, model, shop_info_id, price) VALUES (3, 'AUDI', 2, 80000);
