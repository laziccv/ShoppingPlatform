INSERT INTO Users (id, name, surname, username, email, ph_num, password, date_of_birth, user_image_path, user_type, is_blocked) VALUES
('1', 'Jovan', 'Jovanovic', 'jjovanovic', 'jjovanvoic@example.com', '1234567890', 'hashedpassword', '2000-12-21', '', 'SELLER', false);
INSERT INTO Users (id, name, surname, username, email, ph_Num, password, date_of_birth, user_image_path, user_type, is_blocked) VALUES
('2', 'Dragana', 'Simic', 'simicdragana', 'simicdragana@example.com', '0987654321', 'hashedpassword', '1996-10-15', '', 'BUYER', false);
INSERT INTO Users (id, name, surname, username, email, ph_Num, password, date_of_birth, user_image_path, user_type, is_blocked) VALUES
('3', 'Admin', 'User', 'adminuser', 'admin@example.com', '1928374650', 'hashedpassword', '1988-05-12', '', 'BUYER', false);

INSERT INTO Products (id, name, description, image_path, price, category, s_type, posting_date, users_id, is_sold, reviewed_by_buyer, reviewed_by_seller) VALUES
('1', 'Laptop', 'High-performance gaming laptop.', '', '1200.00', 'Electronics', 'FIXED', '2023-04-23', '1', false, false, false);
INSERT INTO Products (id, name, description, image_path, price, category, s_type, posting_date, users_id, is_sold, reviewed_by_buyer, reviewed_by_seller) VALUES
('2', 'Smartphone', 'Latest model smartphone.', '', '800.00', 'Electronics', 'AUCTION', '2024-02-02', '1', false, true, false);
INSERT INTO Products (id, name, description, image_path, price, category, s_type, posting_date, users_id, is_sold, reviewed_by_buyer, reviewed_by_seller) VALUES
('3', 'Book', 'Fictional novel.', '', '20.00', 'Books', 'FIXED', '2022-10-10', '1', false, true, true);

INSERT INTO Reviews (id, rating, comment, review_date, user_id) VALUES
('1', '5', 'Great product!', '2023-01-01', '2');
INSERT INTO Reviews (id, rating, comment, review_date, user_id) VALUES
('2', '4', 'Good service.', '2023-01-02', '2');
INSERT INTO Reviews (id, rating, comment, review_date, user_id) VALUES
('3', '3', 'Decent, but could be better.', '2023-01-03', '2');

INSERT INTO Reports (id, reason, report_date, reporter_id, reported_id) VALUES 
('1', 'because', '2024-03-03', '1', '2');

INSERT INTO Categories (id, name) VALUES
('1', 'Electronics');
INSERT INTO Categories (id, name) VALUES
('2', 'Books');
INSERT INTO Categories (id, name) VALUES
('3', 'Home Appliances');

INSERT INTO Offers (id, price, buyer_id) VALUES
('1', '850', '2');
INSERT INTO Offers (id, price, buyer_id) VALUES
('2', '900', '3');
INSERT INTO Offers (id, price, buyer_id) VALUES
('3', '950', '2');