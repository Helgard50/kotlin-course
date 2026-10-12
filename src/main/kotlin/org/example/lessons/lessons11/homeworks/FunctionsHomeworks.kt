package org.example.lessons.lessons11.homeworks

import org.example.lessons.lessons09.numbers

//Задачи на сигнатуру метода

//1
fun example1() {

}

//2
fun example2(value1: Int, value2: Int): Int = value1 + value2

//3
fun example3(value: String) {

}

//4
fun example5(value15: List<Int>): Double {
    return value15.average()
}

//5
private fun example4(value: String?): Int? {
    return value?.length
}

//6
fun example6(): Double? {
    return 1.2
}

//7
private fun example7(value: List<Int?>?) {

}

//8
fun example8(value: Int): String? {
    return "124"
}

//9
fun example9(): List<String?> {
    return emptyList()
}

//10
fun example10(value1: String?, value2: Int?): Boolean? {
    return true
}

//Задачи на написание кода

//11
fun multiplyByTwo(number: Int): Int = number * 2

//12
fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}

//13
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (number in 1..n) {
        println(number)
    }
}

//14
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

//15
fun processList(value: List<String?>) {
    for (i in value) {
        if (i == null) {
            return
        }
        println(i)
    }
}

fun main() {
    println(example1())
    println(example2(25, 15))
    println(example3("Noting"))
    println(example4("VeryLongWord"))
    val value15: List<Int> = listOf(1, 2, 3, 4, 5)
    println(example5(value15))
    println(example6())
    println(example7(null))
    println(example8(124))
    println(example9())
    println(example10("One", 1))
    println(multiplyByTwo(155))
    println(isEven(13))
    println(printNumbersUntil(0))
    val numbers = listOf<Int>(1, 27, -15, -17, 2567, -100, 3)
    println(findFirstNegative(numbers))
    val value = listOf<String?>("One", "Two", null, "Tree", "Four")
    println(processList(value))
}