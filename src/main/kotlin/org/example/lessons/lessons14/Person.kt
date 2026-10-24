package org.example.lessons.lessons14

class Person(val name: String, var age: Int) {
    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}