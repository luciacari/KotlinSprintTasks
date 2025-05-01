package org.example.Lesson_3

fun main() {
//    Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера,
//    которая примет строку, отправленную игроком (считаем эти данные уже известными
//    и объявляем строку с данными: “D2-D4;0”.
//
//    Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3
//    составляющих: откуда, куда и номер хода, присвоить соответствующим переменным
//    и распечатать по отдельности.

    var chessMove: String = "D2-D4;0"
    val listChessMove = chessMove.split("-",";")

    var currentPosition: String = listChessMove[0]  // Получаем первый элемент из списка
    var nextPosition: String = listChessMove[1]
    var moveNumber: String = listChessMove[2]

    println("$currentPosition")
    println("$nextPosition")
    println("$moveNumber")
    
}