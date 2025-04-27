package org.example.Lesson_2

fun main() {
//    Сайт с расписанием поездов получает данные с сервера. Сервер посылает
//    время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал
//    данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//    – Создай целочисленные переменные и проинициализируй их этими данными;
//    – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия
//    поезда;
//    – Выведи результат в консоль.

    var hour: Byte = 9
    var minutes: Byte = 39
    var travelTimeInMinutes: Short = 457

    var departureTimeInMinutes: Int = (hour * 60) + minutes
    var arrivalTimeInMinutes: Int = departureTimeInMinutes + travelTimeInMinutes

    println("Время отправления поезда: ${departureTimeInMinutes/60}:${departureTimeInMinutes%60}")
    println("Время прибытия поезда: ${arrivalTimeInMinutes/60}:${arrivalTimeInMinutes%60}")
}