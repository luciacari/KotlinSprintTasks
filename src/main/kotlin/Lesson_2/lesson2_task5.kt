package org.example.Lesson_2

import  kotlin.math.pow

fun main() {
//    Напиши программу-калькулятор для банковского приложения (такой функционал бывает
//    на промо экранах). Используя формулу сложных процентов (ее можно загуглить),
//    нужно посчитать размер вклада через 20 лет с такими условиями:
//    – Клиент ввел в приложении сумму 70_000 рублей (считать ее известной заранее и
//    проинициализировать переменную);
//    – Процентная ставка 16,7% (проценты начисляются в конце года);
//    – Подсчитать размер вклада через 20 лет;
//    – Результат должен быть дробным числом с 3 знаками после разделителя;
//    – Ответ должен получиться таким 1536438.428.

    val interestRate: Double = 16.7
    val period: Int = 20
    val finalDepositAmount: Double

    finalDepositAmount = INITIAL_DEPOSIT_AMOUNT.toDouble() *
            (1.0 + (interestRate / DENOMINATOR.toDouble()) / MONTHS_IN_YEAR.toDouble()).pow(period * MONTHS_IN_YEAR.toDouble())

    println("%.3f".format(finalDepositAmount))
}

const val INITIAL_DEPOSIT_AMOUNT: Int = 70000
const val MONTHS_IN_YEAR: Int = 12
