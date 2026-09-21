package org.example.lessons.lessons06

fun main() {
    //if-else
    val number: Int = 5
    if (number < 0) {
        println("Число отрицательное")
    } else if (number == 0) {
        println("Число равно 0")
    } else {
        println("Число положительное")
    }
    println("Конец программы")

    // Диапазоны
    val intRange = 1..10
    val intRangeUntil = 1 until 10
    val downTo = 10 downTo 1
    val charRange = 'd' .. 'r'

    val inRange = 2 in intRange
    val notInRange = 2 !in intRange

    println(intRange.joinToString(separator = " "))
    println(inRange)

    //when
    val score = 95
    when (score) {
        in 90 .. 100 -> println("Great")
        in 80 .. 89 -> println("Good")
        in 70 .. 79 -> println("Normal")
        else -> println("Need to study")
    }
}