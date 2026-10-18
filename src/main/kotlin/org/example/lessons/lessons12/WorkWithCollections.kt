package org.example.lessons.lessons12

import kotlin.compareTo

val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

val positive = mutableListOf<Int>()

fun main() {
    for (i in numbers) {
        val isPositive = i > 0
        if (isPositive) {
            positive.add(i)
        }
    }
    numbers.forEach {
        // it - это специальная переменная в Kotlin для
        // хранения значения коллекции из текущей итерации
        val isPositive = it > 0
        if (isPositive) {
            positive.add(it)
        }
    }
    println(positive)

    val list = listOf(8, 56, 23, 87, 12, 18, 11)
    val filtered1 = myFilter(list)
    println(filtered1)

    val filtered2 = list.filter {
        it in 7..17
    }
    println(filtered2)

    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers) // Вывод: [2, 4, 8, 264]

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers) // Вывод: [-1, -3, -5]

    val nullableList = listOf(1, null, 2, null, 3)
    val nonNullList = nullableList.filterNotNull()
    println(nonNullList) // Вывод: [1, 2, 3]

    val setOfNumbers = setOf(3, 4, 5, -5, 14)
    val firstElement = setOfNumbers.first()
    val lastElement = setOfNumbers.last()
    println(firstElement)
    println(lastElement)

    val firstPositive = numbers.firstOrNull { it > 0 }
    println(firstPositive) // Вывод: 2
    val nullable = numbers.firstOrNull { it > 1000 }
    println(nullable) // Вывод: null
    val elementOrElse = numbers.getOrElse(10) { -1 }
    println(elementOrElse) // Вывод: -1

    val incrementedNumbers = numbers.map { it + 1 }
    println(incrementedNumbers) // Вывод: [0, 3, -2, 5, -4, 9, 265]

    val numberSquareMap = numbers.associate { it to it * it }
    println(numberSquareMap) // Вывод: {-1=1, 2=4, -3=9, 4=16, -5=25, 8=64, 264=69696}

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )
    val flattenList = multipleList.flatten()
    println(flattenList)

    val flattenListAfterMapping = multipleList.flatMap {list ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)

    val numbersString = numbers.joinToString(separator = " : ")
    println(numbersString) // Вывод: "-1 : 2 : -3 : 4 : -5 : 8 : 264"

    val sortedNumbers = numbers.sorted()
    println(sortedNumbers) // Вывод: [-5, -3, -1, 2, 4, 8, 264]

    val sortedDescendingNumbers = numbers.sortedDescending()
    println(sortedDescendingNumbers) // Вывод: [264, 8, 4, 2, -1, -3, -5]

    println(numbers.size)

    val elements = mutableListOf(23, 6, 76, 4)
    elements.remove(6) // удалит объект 6 из списка или множества
//    elements.removeAt[3] // удалит объект с индексом 3 (работает только со списком)

    if (numbers.isEmpty()) { //isNotEmpty может быть
        println("Коллекция пуста")
    } else {
        println("В коллекции ${numbers.size} значений")
    }

    if (numbers.contains(42)) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

    if (42 in numbers) {
        println("Коллекция содержит ответ на главный вопрос")
    } else {
        println("В коллекции нет ответа на главный вопрос")
    }

    if (setOfNumbers.containsAll(listOf(4, 3))) {
        println("Коллекция содержит числа 4 и 3, при этом порядок не имеет значения")
    } else {
        println("В коллекции нет одного из чисел либо всех проверяемых чисел")
    }

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers) // Вывод: 269

    val averageOfNumbers = numbers.average()
    println(averageOfNumbers) // Вывод: 38.42857142857143

    val maxNumber = numbers.maxOrNull()
    println(maxNumber) // Вывод: 264
    val minNumber = numbers.minOrNull()
    println(minNumber) // Вывод: -5

    val groupedBySign = numbers.groupBy { if (it > 0) "Positive" else "Negative" }
    println(groupedBySign) // Вывод: {Negative=[-1, -3, -5], Positive=[2, 4, 8, 264]}

    val distinctNumbers = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distinctNumbers) // Вывод: [1, 2, 3, 4]

    println(numbers.take(3)) // Вывод: [-1, 2, -3]
    println(numbers.takeLast(3)) // Вывод: [-5, 8, 264]
    println(numbers.drop(2)) // [-3, 4, -5, 8, 264]
}

fun myFilter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}