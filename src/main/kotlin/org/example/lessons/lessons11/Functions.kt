package org.example.lessons.lessons11
//Определение функций

//fun имяФункции(параметры): ТипВозвращаемогоЗначения {
//    // Тело функции
//    return значение
//}

fun sayHello() {
    println("Hello, world!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

//Возвращаемые значения

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

//Однострочные функции

fun multiply(a: Int, b: Int): Int = a * b

//Модификаторы доступа: public и private

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}
fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

//Ключевое слово return

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
    }
    println("Value not found")
}

fun main() {
//    val result = sum(34, 67)
//    println(result)
//    println(sum(34, 67))
//    println(printSum(23,56))
    println(multiply(87, 3))
}