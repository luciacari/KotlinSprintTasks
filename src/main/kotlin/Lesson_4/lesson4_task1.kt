package org.example.Lesson_4

fun main() {
//    На сайте ресторана есть онлайн бронирование. Бронирование доступно, когда
//    есть свободные столики. Всего в ресторане 13 столов и их количество всегда
//    неизменно. На сегодня забронированы все столики, а на завтра 9.
//
//    Напиши программу, которая сообщает информацию о бронировании в момент запроса,
//    путем сравнения данных о свободных столах с данными о столах в ресторане.
//
//    – Создать переменные с количеством забронированных столов на сегодня и на завтра;
//    – Вывести в консоль сообщение о доступности столиков в одном println();
//    – Каждое сообщение с новой строки
//    (НЕ использовать многострочный вывод (“”” “””));
//    – Формат сообщений такой:
//    [Доступность столиков на сегодня: true/false],
//    [Доступность столиков на завтра: true/false]

    var reservedTablesToday: Byte = 13
    var reservedTablesTomorrow: Byte = 9

    var bookingAvailabilityToday: Boolean = reservedTablesToday < NUMBER_OF_TABLES
    var bookingAvailabilityTomorrow: Boolean = reservedTablesTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $bookingAvailabilityToday,\nДоступность столиков на завтра: $bookingAvailabilityTomorrow")
}

const val NUMBER_OF_TABLES: Byte = 13