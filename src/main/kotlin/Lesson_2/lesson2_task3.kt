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
    val minInHour: Byte = 60

    var departureTimeInMinutes: Int = (hour * minInHour) + minutes
    var arrivalTimeInMinutes: Int = departureTimeInMinutes + travelTimeInMinutes

    var arrivalTime: String
    arrivalTime = (arrivalTimeInMinutes/minInHour).toString() + ":" + (arrivalTimeInMinutes%minInHour).toString()

    //println("Время отправления поезда: ${departureTimeInMinutes/minInHour}:${departureTimeInMinutes%minInHour}")
    println("Время прибытия поезда: $arrivalTime")
}