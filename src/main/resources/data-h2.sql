INSERT INTO PUBLIC.MY_LANG(ID, ISOCODE) VALUES (1, 'en');
INSERT INTO PUBLIC.MY_LANG(ID, ISOCODE) VALUES (2, 'de');
INSERT INTO PUBLIC.MY_MESSAGE(ID, MESSAGE, LANG_ID) VALUES
(1, 'message_en1', 1),
(2, 'message_en2', 1),
(3, 'message_de1', 2),
(4, 'message_de2', 2);