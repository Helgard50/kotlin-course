package org.example.lessons.lessons19.homeworks

//Задание 1:
fun <T> getMiddleElement(list: List<T>): T? {
    if (list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}

//Задание 2:
class ListHolder<T> {
    private val elements = mutableListOf<T>()
    fun addElement(element: T) {
        elements.add(element)
    }
    fun getAllElements(): List<T> {
        return elements.toList()
    }
}

//Задание 3:
interface Mapper<T, R> {
    fun mapElement(element: T): R
    fun mapList(elements: List<T>): List<R>
}

//Задание 4:
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun mapElement(element: String): List<String> {
        return element.split(" ")
    }
    override fun mapList(elements: List<String>): List<List<String>> {
        return elements.map { it.split(" ") }
    }
}

//Задание 5:
fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) ->
        value to key
    }
}

//Задание 6:
interface Validator<T> {
    fun validate(element: T): Boolean
}

//Задание 7:
class StringValidator : Validator<String?> {
    override fun validate(element: String?): Boolean {
        return !element.isNullOrBlank()
    }
}

//Задание 8:
class OddValidator: Validator<Int> {
    override fun validate(value: Int): Boolean {
        return value % 2 == 0
    }
}

//Задание 9:
class ListValidator<T: Number>: Validator<List<T?>> {
    override fun validate(element: List<T?>): Boolean {
        return element.all {
            it != null && it.toDouble() != 0.0
        }
    }
}





