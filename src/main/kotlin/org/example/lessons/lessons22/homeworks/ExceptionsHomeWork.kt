package org.example.lessons.lessons22.homeworks

fun main() {
//Задание 1:
    try {
        val str: String? = null
        println(str!!.length)
    } catch (e: NullPointerException) {
        println("Пойман NullPointerException: ${e.message}")
    }
//Задание 2:
    try {
        val list = listOf(1, 2, 3)
        println(list[5])
    } catch (e: IndexOutOfBoundsException) {
        println("Пойман IndexOutOfBoundsException: ${e.message}")
    }
//Задание 3:
    try {
        val obj: Any = "строка"
        val num = obj as Int
        println(num)
    } catch (e: ClassCastException) {
        println("Пойман ClassCastException: ${e.message}")
    }
//Задание 4:
    try {
        setAge(-5)
    } catch (e: IllegalArgumentException) {
        println("Пойман IllegalArgumentException: ${e.message}")
    }
//Задание 5:
    try {
        val s = "abc"
        val n = s.toInt()
        println(n)
    } catch (e: NumberFormatException) {
        println("Пойман NumberFormatException: ${e.message}")
    }
//Задание 6:
    try {
        val c = Connection()
        c.send("hello")
    } catch (e: IllegalStateException) {
        println("Пойман IllegalStateException: ${e.message}")
    }
//Задание 7:
    try {
        val list = mutableListOf<ByteArray>()
        while (true) {
            list.add(ByteArray(10_000_000))
        }
    } catch (e: OutOfMemoryError) {
        println("Пойман OutOfMemoryError: ${e.message}")
    }
//Задание 8:
    try {
        recursive(0)
    } catch (e: StackOverflowError) {
        println("Пойман StackOverflowError: ${e.message}")
    }
//Задание 11:
//    val message = "Проверка провалена: условие не выполнено"
//    throw MyAssertionError(message)
//Задание 12:
    try {
        val list = listOf(1, 2, 3)
        println(list[10])  // провоцируем IndexOutOfBoundsException
    } catch (e: IndexOutOfBoundsException) {
        println("Поймано IndexOutOfBoundsException: ${e.message}")
        throw MyRuntimeException(e)  // оборачиваем и бросаем свой тип
    }
}
//Задание 4:
fun setAge(age: Int) {
    require(age >= 0) { "Возраст не может быть отрицательным" }
}

//Задание 6:
class Connection {
    private var isOpen = false
    fun open() { isOpen = true }
    fun send(data: String) {
        check(isOpen) { "Соединение не открыто" }
        println("Отправка: $data")
    }
}

//Задание 8:
fun recursive(n: Int): Int = recursive(n + 1)

//Задание 9:
fun a() {
    a()
}

//Задание 10:
fun processArgument(arg: Any?) {
    try {
        val length = arg!!.toString().length
        println("Длина строки: $length")
        val list = listOf(1, 2, 3)
        println("Элемент по индексу 10: ${list[10]}")
        val number = arg as Int
        println("Число: $number")
        require(number > 0) { "Число должно быть положительным" }
        val parsed = "не число".toInt()
        println("Распарсили: $parsed")
        check(false) { "Объект находится в недопустимом состоянии" }
        println("Переданный аргумент фантастически хорош!")
    } catch (e: Throwable) {
        when (e) {
            is NullPointerException     -> println("Поймано исключение: NullPointerException")
            is IndexOutOfBoundsException -> println("Поймано исключение: IndexOutOfBoundsException")
            is ClassCastException       -> println("Поймано исключение: ClassCastException")
            is IllegalArgumentException -> println("Поймано исключение: IllegalArgumentException")
            is NumberFormatException    -> println("Поймано исключение: NumberFormatException")
            is IllegalStateException    -> println("Поймано исключение: IllegalStateException")
            else                        -> println("Поймано неизвестное исключение: ${e::class.simpleName}")
        }
        throw e
    }
}

//Задание 11:
class MyAssertionError(message: String) : AssertionError(message)

//Задание 12:
class MyRuntimeException(cause: IndexOutOfBoundsException) : RuntimeException(cause)
