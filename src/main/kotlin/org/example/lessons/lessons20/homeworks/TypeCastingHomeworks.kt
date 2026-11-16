package org.example.lessons.lessons20.homeworks

import kotlin.math.absoluteValue

//Задание 1:
fun Array<Number>.getFirstAndLast(): Pair<Number?, Number?> {
    return if (isEmpty()) {
        Pair(null, null)
    } else {
        Pair(first(), last())
    }
}

//Задание 2:
fun <T : Comparable<T>> MutableList<T>.sortList(isAscending: Boolean): List<T> {
    if (isAscending) {
        sort()
    } else {
        sortDescending()
    }
    return this
}

//Задание 3:
fun <K, V> Map<K, List<V>>?.getValuesByIndex(index: Int): Map<String, V?>? {
    return this?.map { (key, value) ->
        key.toString() to value.getOrNull(index)
    }?.toMap()
}

//Задание 4:
fun Number.within(other: Number, deviation: Number): Boolean {
    return (this.toDouble() - other.toDouble()).absoluteValue <= deviation.toDouble()
}

//Задание 5:
fun String.encrypt(base: Int): String =
    this.map { char -> char + base }.joinToString("")

fun String.decrypt(base: Int): String =
    this.map { char -> char - base }.joinToString("")

//Задание 6:
fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}