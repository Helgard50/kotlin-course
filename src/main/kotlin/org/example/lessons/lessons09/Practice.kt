package org.example.lessons.lessons09

val example1: Array<Int> = arrayOf(0, 0)
val example2: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
val example3: Array<Int> = Array(10) {0}

fun main() {
    for (i in 1..10) {
         example3[i - 1] = i * 10
    }
    println(example3.joinToString { ", " })
}