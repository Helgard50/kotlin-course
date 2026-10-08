package org.example.lessons.lessons10

val emptyMap: Map<String, String> = mapOf<String, String>() //Пустой словарь

val capitals: Map<String, String> = mapOf("Россия" to "Москва", "Франция" to "Париж")
val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

val mutableCapitals: MutableMap<String, String> = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")

fun main() {
    mutableCapitals["Германия"] = "Берлин"
    mutableCapitals.remove("Франция")
    val capitalOfRussia = capitals["Россия"]
    println(capitalOfRussia)

    for ((country, capital) in capitals) {
        println("$country: $capital")
    }

    for (entity in capitals) {
        println("${entity.key}: ${entity.value}")
    }

    if ("Россия" in capitals) {
        println("Столица России: ${capitals["Россия"]}")
    }
}