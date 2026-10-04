package org.example.lessons.lessons09

//Массивы
val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
val emptyArray: Array<String> = Array(5) { "" }
val emptyNullableArray: Array<Int?> = arrayOfNulls(5)
//Списки
val readOnlyList: List<String> = listOf("a", "b", "c")
val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
//Множества
val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5, 5)
val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
val emptySet: Set<Int> = emptySet()
val emptyMutableSet: MutableSet<Int> = mutableSetOf()

fun main() {
    numbers[0] = 10
    println(numbers.joinToString(", "))
    mutableList.add("d")
    mutableList.removeAt(0)
    mutableList[0] = "e"
    println(mutableList)
    mutableNumbersSet.add(6)
    mutableNumbersSet.remove(1)
    println(mutableNumbersSet)

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("'${list[index--]}'")
    }
}