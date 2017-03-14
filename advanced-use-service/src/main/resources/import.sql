# # # # # # # # # # # #
#   此文件请不要整理  #
# # # # # # # # # # # #

INSERT INTO users (username, password, enabled)
VALUES ('user1', '$2a$10$9uuTnBgg4Lrk/ipBctwQ1O0vI8ODOAzF6WsRc0UW4pf80e08CQCMq', TRUE);
INSERT INTO users (username, password, enabled)
VALUES ('user2', '$2a$10$7nvfgKN.tJtyYZ12Xv6bTO.TiYZx8IfQKOD1e0JikeibjPFNuyzb.', TRUE);

INSERT INTO roles (username, role) VALUES ('user1', 'ROLE_USER');
INSERT INTO roles (username, role) VALUES ('user2', 'ROLE_ADMIN');