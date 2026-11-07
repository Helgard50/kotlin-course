package org.example.lessons.lessons17

import kotlin.math.min

class Account(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }

    fun withdraw(amount: Double): Double {
        if (amount > 0) {
            val withdraw = min(amount, balance)
            balance -= withdraw
            return withdraw
        }
        return 0.0
    }
}

//fun main() {
//
//    val account = Account(0.0)
//    account.deposit(15.0)
//    println("Текущий баланс ${account.getBalance()}")
//    println("Хочу снять 12 и получаю ${account.withdraw(12.0)}")
//    println("Текущий баланс ${account.getBalance()}")
//    println("Хочу снять 10 но получаю ${account.withdraw(10.0)}")
//    println("Текущий баланс ${account.getBalance()}")
//}

open class Person(private val name: String, protected val age: Int) {
    // Публичный метод
    fun greet() {
        secret()
        println("Привет, меня зовут $name.")
    }
    // Защищённый метод
    protected fun getName(): String {
        return name
    }
    // Приватный метод
    private fun secret() {
        println("Это секретный метод.")
    }
}

class Student(
    name: String,
    age: Int,
    val studentId: Int
) : Person(name, age) {
    // Публичный метод
    fun study() {
        // Используем защищённый метод getName() из родительского класса
        println("${getName()} (id: $studentId) учится.")
    }
    fun showAge() {
        // Обращаемся к защищённому полю age из родительского класса
        println("Мне $age лет.")
    }
    fun tryAccessSecret() {
//         Попытка вызвать приватный метод secret() из родительского класса
//         secret() // Ошибка компиляции: метод secret() недоступен
    }
}
fun main() {
    val student = Student("Алексей", 20, 12345)
    student.greet()        // Вывод: Это секретный метод. \n Привет, меня зовут Алексей.
    student.study()        // Вывод: Алексей учится.
    student.showAge()      // Вывод: Мне 20 лет.
    println(student.studentId)
//    println(student.name)
//    println(student.age)
//    student.secret()    // Ошибка: метод secret() недоступен
    student.tryAccessSecret()
}

class SomeClass private constructor(val arg1: Int, val arg2: Int) {

    companion object {

        fun init(arg1: Int): SomeClass {
            return SomeClass(arg1, arg1 + 1)
        }
    }
    private val data = mutableListOf<AnotherClass>()

    fun add(arg: Int) {
        data.add(AnotherClass(arg + arg2))
    }

    fun get(): List<Int> {
        return data.map { it.arg }
    }
}

private data class AnotherClass(val arg: Int)