package org.example.Lesson_2

fun main() {
//    В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию
//    устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
//    Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//    – Расходы на выплату зарплаты постоянных сотрудников;
//    – Общие расходы по ЗП после прихода стажеров;
//    – Среднюю ЗП одного сотрудника после устройства стажеров.
//
//    Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
//    Все значения необходимо вывести в виде целых чисел.

    val regularEmployee: Byte = 50 // количество сотрудников
    val regSalary: Int = 30000 // зарплата сотрудника
    val traineeEmployee: Byte = 30 // количество стажеров
    val traineeSalary: Int = 20000 // зарплата стажера

    // Расходы на выплату зарплаты постоянных сотрудников:
    var regSalaryExpenses = regularEmployee * regSalary
    // Общие расходы по ЗП после прихода стажеров:
    var allSalaryExpenses = regSalaryExpenses + traineeEmployee * traineeSalary
    // Средняя ЗП одного сотрудника после устройства стажеров:
    var avgSalary = allSalaryExpenses / (regularEmployee + traineeEmployee)

    println(regSalaryExpenses)
    println(allSalaryExpenses)
    println(avgSalary)
}