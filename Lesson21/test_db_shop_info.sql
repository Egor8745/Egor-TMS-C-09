create table shop_info
(
    id               int          not null
        primary key,
    auto_shop        varchar(256) null,
    telephone_number varchar(256) null
);

INSERT INTO test_db.shop_info (id, auto_shop, telephone_number) VALUES (1, 'АТЛАНТ-М', '+3752993463632');
INSERT INTO test_db.shop_info (id, auto_shop, telephone_number) VALUES (2, 'НЕКСТ-АВТО', '+37533345346346');
