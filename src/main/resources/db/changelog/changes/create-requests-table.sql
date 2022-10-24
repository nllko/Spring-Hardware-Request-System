
--liquibase formatted sql

--changeset nikolajs:1

CREATE TABLE request
(
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    parameters VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    created_at TIMESTAMP,
    status VARCHAR(255) NOT NULL
);