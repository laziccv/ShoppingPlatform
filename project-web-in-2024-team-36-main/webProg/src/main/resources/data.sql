INSERT INTO Users (name, surname, username, email, ph_num, password, date_of_birth, user_image_path, user_type, is_blocked) VALUES
('Jovan', 'Jovanovic', 'jjovanovic', 'jjovanvoic@example.com', '1234567890', 'hashedpassword', '2000-12-21', '', 'SELLER', false);
--INSERT INTO Users (name, surname, username, email, phNum, password, dateOfBirth, userImagePath, userType, isBlocked) VALUES
--('Dragana', 'Simic', 'simicdragana', 'simicdragana@example.com', '0987654321', 'hashedpassword', 1996-10-15, '', 'BUYER', false);
--INSERT INTO Users (name, surname, username, email, phNum, password, dateOfBirth, userImagePath, userType, isBlocked) VALUES
--('Admin', 'User', 'adminuser', 'admin@example.com', '1928374650', 'hashedpassword', 1988-05-12, '', 'ADMIN', false);

--INSERT INTO Products (name, description, imagePath, price, category, sType, postingDate, seller_id, is_sold, reviewedByBuyer, reviewedBySeller) VALUES
--('Laptop', 'High-performance gaming laptop.', '/images/laptop.jpg', 1200.00, 'Electronics', 'FIXED', 2023-04-23, 1, false, false, false),
--INSERT INTO Products (name, description, imagePath, price, category, sType, postingDate, seller_id, is_sold, reviewedByBuyer, reviewedBySeller) VALUES
--('Smartphone', 'Latest model smartphone.', '/images/smartphone.jpg', 800.00, 'Electronics', 'AUCTION', 2024-02-02, 1, false, true, false),
--INSERT INTO Products (name, description, imagePath, price, category, sType, postingDate, seller_id, is_sold, reviewedByBuyer, reviewedBySeller) VALUES
--('Book', 'Fictional novel.', '/images/book.jpg', 20.00, 'Books', 'FIXED', 2022-10-10, 1, false, true, true);

--INSERT INTO Reviews (rating, comment, reviewDate, reviewer_id, reviewed_user_id) VALUES
--(5, 'Great product!', '2023-01-01', 2, 1),
--INSERT INTO Reviews (rating, comment, reviewDate, reviewer_id, reviewed_user_id) VALUES
--(4, 'Good service.', '2023-01-02', 2, 1),
--INSERT INTO Reviews (rating, comment, reviewDate, reviewer_id, reviewed_user_id) VALUES
--(3, 'Decent, but could be better.', '2023-01-03', 2, 1);

--INSERT INTO Categories (name) VALUES
--('Electronics'),
--INSERT INTO Categories (name) VALUES
--('Books'),
--INSERT INTO Categories (name) VALUES
--('Home Appliances');

--INSERT INTO Offers (price, buyer_id) VALUES
--(850.00, 2),
--INSERT INTO Offers (price, buyer_id) VALUES
--(900.00, 3),
--INSERT INTO Offers (price, buyer_id) VALUES
--(950.00, 2);