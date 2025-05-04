package org.example.Lesson_4

fun main() {
//    Научно-исследовательский корабль может приступить к долгосрочному плаванию
//    при выполнении следующих условий:
//    - корабль не имеет повреждений;
//    - число экипажа составляет от 55 (включительно) до 70 человек (включительно);
//    - на борту есть более 50 ящиков провизии (не включительно);
//    - погода благоприятна или неблагоприятна.
//    Альтернативно, корабль может отплыть даже при наличии незначительных повреждений,
//    при условии что:
//    - на борту рекомендованный состав экипажа 70 человек;
//    - погода благоприятная;
//    - на борту есть 50 и более ящиков провизии.
//    В качестве входных данных используй информацию, введенную через консоль:
//    - наличие повреждений корпуса (Boolean переменная);
//    - текущий состав экипажа;
//    - количество ящиков с провизией на борту;
//    - благоприятность метеоусловий (Boolean переменная).
//    Напиши программу, которая будет определять, может ли корабль отправиться в
//    плавание. Программа должна анализировать эти данные и выводить результат в
//    консоль. Для анализа должно использоваться единое составное условие, состоящие
//    только из логических операторов.

    val isDamage: Boolean
    val currentNumberCrew: Int
    val numberBoxesProvisions: Int
    val favorableWeather: Boolean

    println("Есть повреждения корпуса (true/false)?:")
    isDamage = readln().toBoolean()
    println("Какое текущее число экипажа?:")
    currentNumberCrew = readln().toInt()
    println("Какое количество ящиков с провизией на борту?:")
    numberBoxesProvisions = readln().toInt()
    println("Погода благоприятна (true/false)?:")
    favorableWeather = readln().toBoolean()

    val result: Boolean =
        (isDamage != true && numberBoxesProvisions > BOX_OF_PROVISIONS && (currentNumberCrew >= MINIMUM_CREW && currentNumberCrew <= MAXIMUM_CREW))
                || (currentNumberCrew == 70 && favorableWeather == true && numberBoxesProvisions >= BOX_OF_PROVISIONS)

    if (result) println("Ваш корабль может отправиться в плавание!")
    else println("Ваш корабль не может отправиться в плавание!")
}

const val MINIMUM_CREW: Int = 55
const val MAXIMUM_CREW: Int = 70
const val BOX_OF_PROVISIONS = 50