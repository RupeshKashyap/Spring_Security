select * from users;
INSERT INTO users (username, password,enabled) values ('user','Test@123',true);
INSERT INTO users (username, password,enabled) values ('admin','Test@123',true);
--
--
INSERT INTO authorities (username,authority) values ('user','ROLE_USER');
INSERT INTO authorities(username,authority) values ('admin','ROLE_ADMIN');