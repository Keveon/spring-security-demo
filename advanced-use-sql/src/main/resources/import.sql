# # # # # # # # # # # #
#   此文件请不要整理  #
# # # # # # # # # # # #

INSERT INTO users (username, password, enabled) VALUES ('user1', 'password1', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('user2', 'password2', TRUE);

INSERT INTO roles (username, role) VALUES ('user1', 'ROLE_USER');
INSERT INTO roles (username, role) VALUES ('user2', 'ROLE_ADMIN');