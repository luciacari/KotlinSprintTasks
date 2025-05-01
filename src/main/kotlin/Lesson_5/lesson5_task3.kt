package org.example.Lesson_5

fun main() {
//    Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
//    Если угадать только одно – игрок получает утешительный приз. Напиши программу,
//    проверяющую выигрыш. Пользователь должен вводить числа в консоль. Правильные
//    числа заранее известны и хранятся в переменных. Оформить ввод текстовыми
//    подсказками о том, что нужно вводить. Вывести отдельным сообщением, какие числа
//    были нужны для победы.
//
//    - если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
//    - если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
//    - если не угадано ничего, вывести “Неудача!”;
//    - программа должна учитывать ввод чисел в обратном порядке.

    val firstNumber: Int = 13
    val secondNumber: Int = 39

    println("Введите первое число от 0 до 42: ")
    val userFirstNumber = readln().toInt()
    println("Введите второе число от 0 до 42: ")
    val userSecondNumber = readln().toInt()

    if ((userSecondNumber == secondNumber && userFirstNumber == firstNumber)
        || (userSecondNumber == firstNumber && userFirstNumber == secondNumber)
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((userSecondNumber == secondNumber || userFirstNumber == firstNumber)
        || (userSecondNumber == firstNumber || userFirstNumber == secondNumber)
    )
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Для победы Вам нужно было угадать числа $firstNumber и $secondNumber")
}
