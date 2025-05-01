package org.example.Lesson_5

fun main() {

    val userName: String = "Zaphod"
    val userPassword: String = "PanGalactic"
    val enteredUserName: String
    val enteredUserPassword: String

    println("Введи, пожалуйста, свое имя пользователя:")
    enteredUserName = readln()

    if (enteredUserName != userName)
        println(
            "Извините, пользователь с именем \"$enteredUserName\" не зарегистрирован в системе!\n" +
                    "Хотите зарегистрироваться?"
        )
    else println("Введите, пожалуйста, пароль для пользователя \"$enteredUserName\":")
    enteredUserPassword = readln()
    if (enteredUserPassword == userPassword)
        println("$userName, добро пожаловать в систему!")
    else println("Введённый пароль неверен. Доступ запрещён!")


}
