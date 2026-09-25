package org.example.lessons.lessons07.homeworks

//Задания для цикла for
//
//Прямой диапазон
fun main() {
    for (i in 1..5) {
        println(i)
    }

    for (i in 1..10 step 1) {
        if (i % 2 == 0)
            println(i)
    }
}

//Обратный диапазон
fun main() {
    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

//С шагом (step)
fun main() {
    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 1 .. 20 step 3) {
        println(i)
    }
}

//Использование до (until)
fun main() {
    val size: Int = 20
    for (i in 3 until size step 2) {
        println(size)
    }
}

//Задания для цикла while

//Цикл while
fun main() {
    var item = 1
    while (++item <= 5)
        println(item * item)
}

fun main() {
    var item = 10
    while (--item >= 5)
        println(item)
}

//Цикл do while
fun main() {
    var item = 5
    do {
        println(item)
    } while (--item >= 1)
}

fun main() {
    var counter = 5
    do {
        println(counter)
    } while (++counter < 10)
}

//Задания для прерывания и пропуска итерации

//Использование break
fun main() {
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
}

fun main() {
    var counter = 1
    while (true) {
        println(counter++)
        if (counter == 10) {
            break
        }
    }
}

//Использование continue
fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
}

fun main() {
    var counter = 1
    while (counter++ <= 10) {
        if (counter % 3 == 0) continue
            println(counter)
    }
}