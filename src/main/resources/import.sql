# # # # # # # # # # # #
#   此文件请不要整理  #
# # # # # # # # # # # #

# DROP DATABASE IF EXISTS demo_security;
# CREATE DATABASE IF NOT EXISTS demo_security DEFAULT CHARACTER SET utf8;

# DROP TABLE IF EXISTS users;
# CREATE TABLE IF NOT EXISTS users (username VARCHAR(50) NOT NULL PRIMARY KEY, password VARCHAR(50) NOT NULL, enabled  TINYINT     NOT NULL DEFAULT 1);
#
# DROP TABLE IF EXISTS user_roles;
# CREATE TABLE IF NOT EXISTS user_roles (user_role_id INTEGER PRIMARY KEY AUTO_INCREMENT, username     VARCHAR(50) NOT NULL, role         VARCHAR(50) NOT NULL, KEY fk_username_idx (username), CONSTRAINT fk_username FOREIGN KEY (username) REFERENCES users (username));

INSERT INTO demo_security.users (username, password, enabled) VALUES ('user1', 'password1', TRUE);
INSERT INTO demo_security.users (username, password, enabled) VALUES ('user2', 'password2', TRUE);

INSERT INTO user_roles (user_role_id, username, role) VALUES (1, 'user1', 'ROLE_USER');
INSERT INTO user_roles (user_role_id, username, role) VALUES (2, 'user1', 'ROLE_ADMIN');
INSERT INTO user_roles (user_role_id, username, role) VALUES (3, 'user2', 'ROLE_USER');