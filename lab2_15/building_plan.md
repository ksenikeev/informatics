# Лабораторная работа - оптимизация процесса

## Описание работ
| NN  |          Работа          | Длительность<br/>(дней) | зависимость |
|-----|:------------------------:|------------------------:|------------:|
| 0   |       Начало работ       |                         |             |
| 1   |          Проект          |                       7 |           0 |
| 2   |    Изготовление окон     |                       7 |           1 |
| 3   |   Изготовление дверей    |                       7 |           1 |
| 4   |         возведение фундамента         |                      14 |           1 |
| 5   |        прокладка коммуникаций <br/>(канализация, вода, электричество)         |                       4 |           4 |
| 6   |         возведение стен         |                      14 |           4 |
| 7   |        возведение крыши         |                       3 |           6 |
| 8   |         установка окон         |                       1 |         2,7 |
| 9   |         установка дверей         |                       1 |        3, 7 |
| 10  |        установка отопительных приборов <br/>(батарей)         |                       3 |     5, 8, 9 |
| 11  |         прокладка электропроводки         |                       3 |         5,7 |
| 12  |         отделка стен и потолка         |                       7 |    8, 9, 11 |
| 13  |        отделка пола         |                       7 |          12 |
| 14  |        установка осветительных приборов        |                       1 |          12 |
| 15  |         установка сантехники         |                       2 |    5,11, 12 |
| 16  | завершение строительства |                         |      0 - 15 |

## Построить граф работ

## Написать программу, эмулирующую ход работ

1. Каждая работа описывается отдельным классом, реализующим интерфейс `Runnable`
2. В методе `run` вывести на консоль сообщения `"Start наименование работы"`, `"End наименование работы"`
3. Процесс осуществления работы эмулировать задержкой `Thread.sleep(1000 * days)`, принимая 1 день за 1 секунду
4. Вывести на консоль сообщение о старте работ и сообщение о завершении работ, указав общую длительность всего строительстваы