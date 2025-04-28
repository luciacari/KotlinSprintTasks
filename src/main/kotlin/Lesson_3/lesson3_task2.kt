package org.example.Lesson_3

fun main() {
//    Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова,
//    и поменяла фамилию. О ней есть запись в одном из государственных приложений.
//    Приложение отслеживает изменения персональных данных граждан.
//    Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22
//    в формате [ФИО, возраст]. Все части ФИО и возраст изначально хранятся в отдельных
//    переменных.
    var lastName: String = "Андреева"
    var firstName: String = "Татьяна"
    var fathersName: String = "Сергеевна"
    var age: Byte = 20
    println("$lastName $firstName $fathersName, $age")

    lastName = "Сидорова"
    age = 22
    println("$lastName $firstName $fathersName, $age")
}