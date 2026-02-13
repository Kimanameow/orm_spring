DROP TABLE users;
DROP TABLE cars;

CREATE TABLE cars (
    id SERIAL PRIMARY KEY,
    model VARCHAR(255),
    series BIGINT,
    user_id BIGINT REFERENCES users(id)
);

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    last_name VARCHAR(255),
    email VARCHAR(255),
    car_id INTEGER REFERENCES cars(id)
);

