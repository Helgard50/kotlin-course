package org.example.lessons.lesson05

val sum = 10 + 5 // 15
val diff = 10 - 5 // 5
val product = 10 * 5 // 50
val quotient = 10 / 5 // 2
val remainder = 10 % 5 // 0
val remainder1 = 10 % 6 // 4
val remainder2 = 10 % 4 // 2

val isEqual: Boolean = (5 == 5) // true
val isNptEqual = (5 != 5) // false
val isGreater = (5 > 3) // true
val isLesser = (5 < 3) // false
val isGreaterOrEqual = (5 >= 5) // true
val isLesserOrEqual = (5 <= 3) // false

val andResult = (5 > 3) && (5 > 4) // true
val orResult = (5 > 3) || (5 < 3) // true
val notResult = !(5 > 3) // false

fun main() {
    var number = 5
    number += 3 // number теперь равно 8
    // равнозначно выражению: number = number + 3
    println(number++)
    // индесный инкремент если ++ после переменной
    // префиксный инкремент если ++ перед переменной
    val incNumber = number++ // 9
    println(incNumber)
    println(number)
    val decNumber = number-- // 8

    val priorities = (5 + 6) * 2 // 22, скобки
    val priorities1 = 5 + 6 * 2 // 17, умножение
    val priorities2 = 5 + 6 / 2 // 8, деление

    val priorities3 = false || true && !false // true

    val name: String? = null
    val result = name ?: "Unknown" // Оператор Элвиса, "Unknown", так как name равно null
    println(result)
}

fun printVolume(userVolume: Int?) {
    val defaultVolume = 30
    println(userVolume ?: defaultVolume)
}



