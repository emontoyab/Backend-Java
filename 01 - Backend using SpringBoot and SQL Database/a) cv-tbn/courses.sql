CREATE DATABASE IF NOT EXISTS cv3;

USE cv3;

CREATE TABLE IF NOT EXISTS courses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(80) NOT NULL,
    institution VARCHAR(80) NOT NULL,
    date_start VARCHAR(10),
    date_end VARCHAR(10),
    certification TINYINT(1)
);

