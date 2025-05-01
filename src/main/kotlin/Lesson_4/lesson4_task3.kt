package org.example.Lesson_4

fun main() {
//    На территории агрокомплекса функционирует система автоматического мониторинга
//    условий для роста растений. Напиши программу, которая будет определять, подходят
//    ли текущие условия для успешного роста бобовых культур.
//    Критерии благоприятных условий включают:
//    - наличие солнечной погоды;
//    - открытый тент;
//    - влажность воздуха составляет 20%;
//    - текущее время года - не зима.
//    Программа должна выводить результат анализа условий в формате: “Благоприятные
//    ли условия сейчас для роста бобовых? true/false”
//    Для проверки работы программы, инициализируй переменные следующими значениями:
//    - погода сегодня - солнечная;
//    - тент на данный момент - открыт;
//    - влажность воздуха - 20%;
//    - текущее время года - зима.
//    И типами данных - boolean, boolean, int, String.

    val weatherIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val airMoisture: Int = 20
    val currentSeason: String = "зима"

    val comparisonResult: Boolean =
        (weatherIsSunny == WEATHER_IS_SUNNY) && (tentIsOpen == TENT_IS_OPEN) && (airMoisture == AIR_MOISTURE) && (currentSeason ==
                CURRENT_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult")
}

const val WEATHER_IS_SUNNY: Boolean = true
const val TENT_IS_OPEN: Boolean = true
const val AIR_MOISTURE: Int = 20
const val CURRENT_SEASON: String = "не зима"
