package org.example.lessons.lessons19

class BoxAny(val item: Any)

class Box<P>(val item: P) {
    fun PrintThis(t: P): P {
        return t
    }
}

fun <S> secondOrNull(list: List<S>): S? {
    return list.getOrNull(1)
}

fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {

    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    val appleBoxAnyItem: Any = appleBoxAny.item // Any вместо строки
    val intBoxAnyItem: Any = intBoxAny.item // Any вместо числа

    val appleBox = Box("Apple")
    val intBox = Box(42)

    val appleBoxItem: String = appleBox.item
    val intBoxItem: Int = intBox.item

    val secondElementLength: Int? = secondOrNull<String>(listOf("a", "b", "c"))?.length

    println(sum(5, 10))        // 15.0
    println(sum(3.5, 2.5))     // 6.0
}