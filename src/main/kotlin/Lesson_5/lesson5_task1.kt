package org.example.Lesson_5

fun main() {
//    Нужно написать часть модуля для авторизации пользователя. Для входа в
//    приложение пользователь должен доказать, что он не бот. Для этого программа
//    предлагает решить простой математический пример – сложить два числа
//    (сообщить об этом пользователю).
//
//    Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
//    При успешном решении вход в программу символизируется сообщением
//    “Добро пожаловать!". В противном случае вывести сообщение "Доступ запрещен."

    val correctResult: Int = 8
    println("Напишите результат сложения чисел 5 и 3: ")
    val userAnswer = readln().toInt()

    val resultText = if (userAnswer == correctResult) "Добро пожаловать!"
    else "Доступ запрещен."

    println(resultText)
}
