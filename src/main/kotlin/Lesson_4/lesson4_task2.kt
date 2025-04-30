package org.example.Lesson_4

fun main() {
//    При работе на таможенном терминале важно точно определить категорию каждого груза.
//    Напиши программу, которая проверяет, соответствует ли груз категории "Average".
//    Эта категория имеет следующие параметры: вес от 35 кг (не включительно) до 100 кг
//    (включительно), и объем меньше 100 литров (не включительно).
//
//    Создай программу, которая отображает соответствие данных груза категории "Average".
//    Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л
//    соответствует категории 'Average': false".
//    - укажи предварительно заданные параметры категории;
//    - проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л
//    и 50 кг / 100 л;
//    - сделай сравнение непосредственно внутри println() и без
//    использования диапазонов.

    val minWeight: Int = 35
    val maxWeight: Int = 100
    val maxVolume: Int = 100

    var cargoWeight: Int = 20
    var cargoVolume: Int = 80

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
                "${(cargoWeight > minWeight) && (cargoWeight <= maxWeight) && cargoVolume < maxVolume}"
    )

    cargoWeight = 50
    cargoVolume = 100

    println(
        "Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
                "${(cargoWeight > minWeight) && (cargoWeight <= maxWeight) && cargoVolume < maxVolume}"
    )
}

