package org.example.Lesson_1

fun main() {
//    Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//    - Переведи в коде количество секунд в целые минуты и целые часы,
//    сохраняя остаток секунд и минут в новые переменные;
//    - Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
//    например так: 01:30:09;
//    - Значения часов, минут и секунд отображать двумя цифрами.

    val flightInSeconds: Short = 6480

    val flightInHours: Int = flightInSeconds / (SEC_IN_MINUTE * MIN_IN_HOUR)
    var remainderInSeconds: Int = flightInSeconds % (SEC_IN_MINUTE * MIN_IN_HOUR)

    val flightInMinutes: Int = remainderInSeconds / SEC_IN_MINUTE
    remainderInSeconds = remainderInSeconds % SEC_IN_MINUTE

    println("%02d:%02d:%02d".format(flightInHours, flightInMinutes, remainderInSeconds))
}

const val SEC_IN_MINUTE: Byte = 60
const val MIN_IN_HOUR: Byte = 60