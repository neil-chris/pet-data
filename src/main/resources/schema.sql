DROP TABLE IF EXISTS pet;
CREATE TABLE pet
(
    id         INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    name VARCHAR(45),
    kind       VARCHAR(45),
    gender     VARCHAR(45),
    vaccinated BOOLEAN
);