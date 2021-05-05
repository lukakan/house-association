INSERT INTO administrations(id, name)
VALUES
(1, 'Knurowska 13-15'),
(2, 'Opolska 1-5');

INSERT INTO buildings(id, street, number, administration_id)
VALUES
(1, 'Knurowska', '13', 1),
(2, 'Knurowska', '15', 1),
(3, 'Opolska', '1', 2);

INSERT INTO flats (id, number, surface, building_id)
VALUES
(1, '1A', 54.5, 1),
(2, '1B', 54.5, 1),
(3, '2', 110, 1),
(4, '1', 105.4, 2),
(5, '2', 105.3, 2),
(6, '3', 64.5, 2),
(7, '1', 88, 3),
(8, '2', 88, 3),
(9, '3', 88, 3),
(10, '4', 125.5, 3);

INSERT INTO meters (id, number, flat_id)
VALUES
(1, 125458, 1),
(2, 254581, 2),
(3, 545812, 3),
(4, 458125, 4),
(5, 558125, 5),
(6, 658125, 6),
(7, 758125, 7),
(8, 888925, 8),
(9, 958123, 9),
(10, 958123, 10),
(11, 118123, 10);

INSERT INTO records(id, date, value, meter_id)
VALUES
(1, '2021-01-02', 1.93, 1),
(2, '2021-01-15', 2.53, 1),
(3, '2021-01-29', 3.53, 1),
(4, '2021-02-05', 4.53, 1),
(5, '2021-02-15', 6.55, 1),
(6, '2021-01-02', 1.00, 2),
(7, '2021-01-15', 2.15, 2),
(8, '2021-01-29', 3.12, 2),
(9, '2021-02-05', 4.2, 2),
(10, '2021-02-15', 5.3, 2),
(11, '2021-01-02', 1.00, 3),
(12, '2021-02-15', 6.15, 3),
(13, '2021-01-29', 3.12, 4),
(14, '2021-02-05', 4.2, 4),
(15, '2021-02-15', 6.3, 4),
(16, '2021-01-02', 1.00, 5),
(17, '2021-02-23', 7.15, 5),
(18, '2021-01-30', 3.12, 6),
(19, '2021-02-05', 4.2, 7),
(20, '2021-02-15', 5.3, 7),
(21, '2021-02-25', 12.3, 8),
(22, '2021-01-22', 5.3, 9),
(23, '2021-01-12', 2.3, 10),
(24, '2021-01-28', 1.3, 11),
(25, '2021-02-28', 3.3, 11);