CREATE TABLE studentmanagement.user
(
    id          BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    phone_number VARCHAR(20)        NOT NULL,
    password    TEXT               NOT NULL,
    full_name    VARCHAR(20)        NOT NULL,
    address     VARCHAR(256)       NOT NULL,
    date_of_birth VARCHAR(20),
    token       TEXT,
    role        INT
);
