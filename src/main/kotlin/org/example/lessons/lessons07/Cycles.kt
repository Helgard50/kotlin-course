package org.example.lessons.lessons07

fun main() {
    val collection = listOf<String>("1", "2", "3")
    for (item in collection) {
        println(item)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1 .. 10 step 2) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    val range = 1..10
    for (item in range) {
        println(item)
    }

    //while - я сначала подумал, а потом сделал
    var counter = 0
    while (++counter < 10) {
        println(counter)
    }
    println("----------")
    println(counter)

    //do while - я сначала сделал, а потом подумал
    do {
        println(counter)
    } while (counter++ < 10)

    for (i in 1..10) {
        if (i == 3) break
        println(i)
    }
    println("STOP")

    for (i in 1..10) {
        if (i == 3) continue
        println(i)
    }
}