DROP TABLE IF EXISTS drinks;
DROP TABLE IF EXISTS coins;

CREATE TABLE drinks( id INT AUTO_INCREMENT PRIMARY KEY, brand VARCHAR(255) NOT NULL, price DECIMAL(10, 2) NOT NULL, quantity INT NOT NULL, max_quantity INT NOT NULL);
CREATE TABLE coins( id INT AUTO_INCREMENT PRIMARY KEY, denomination VARCHAR(255) NOT NULL, quantity INT NOT NULL, max_quantity INT NOT NULL);

INSERT INTO coins (denomination, quantity, max_quantity) VALUES
    ('10c', 20, 20),
    ('20c', 20, 20),
    ('50c', 20, 20),
    ('RM1', 20, 20);

INSERT INTO drinks (brand, price, quantity, max_quantity) VALUES
    ('Koka Kola', 4.00, 10, 20);
    ('Bepsi', 3.50, 10, 20);
    ('Manta', 3.50, 10, 20);
    ('Dr Bepper', 3.00, 10, 20);
    ('9Up', 3.00, 10, 20);
    ('Meylo', 2.00, 10, 20);
