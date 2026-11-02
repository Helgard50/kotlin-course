package org.example.lessons.lessons16.homeworks

import jdk.jfr.DataAmount
import kotlin.math.PI
import kotlin.math.sin

fun main() {
    val animals: List<Animals> = listOf(
        Dog(),
        Cat(),
        Bird()
    )
    for (animal in animals) {
        animal.makeSound()
    }

    val list = listOf(
        Circle(5.7), Triangle(3.2, 6.3, 8.1)
    )

    for (item in list) {
        println(item.area())
    }
    val text = "Text1" +
            "Text2" +
            "Text3"

    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    laserPrinter.printPage(text)
    inkjetPrinter.printPage(text)

    val shoppingCart = ShoppingCart()
    shoppingCart.addToCart(678)
    shoppingCart.addToCart(101, 101)
    shoppingCart.addToCart(mapOf(202 to 2, 303 to 3))
    shoppingCart.addToCart(listOf(401, 404, 505))
    println(shoppingCart)
}

object Colors {
    const val RESET = "\u001B[0m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

abstract class Animals {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog: Animals() {
    override fun makeSound() {
        println("${Colors.RED}Bark${Colors.RESET}")
    }
}

class Cat: Animals() {
    override fun makeSound() {
        println("${Colors.GREEN}Bark${Colors.RESET}")
    }
}

class Bird: Animals() {
    override fun makeSound() {
        println("${Colors.GREEN}Bark${Colors.RESET}")
    }
}

//
abstract class Shape {
    abstract fun area(): Double
}

class Circle(
    val radius: Double
): Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class Square(
    val side: Double
): Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val corner: Double
): Shape() {
    override fun area(): Double {
        return sideA * sideB * sin(corner) / 2
    }
}

//
object ColorsPrinter {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

abstract class Printer() {
    abstract fun printPage(abstractPrint: String)
}

class LaserPrinter(): Printer() {
    override fun printPage(abstractPrint: String) {
        val words = abstractPrint.split(" ")
        for (item in words) {
            print("${ColorsPrinter.WHITE}$item ${ColorsPrinter.RESET}")
        }
        println()
    }
}

class InkjetPrinter(): Printer() {
    val colors = listOf(
        ColorsPrinter.RED,
        ColorsPrinter.GREEN,
        ColorsPrinter.YELLOW,
        ColorsPrinter.PURPLE,
        ColorsPrinter.CYAN
    )

    override fun printPage(abstractPrint: String) {
        val words = abstractPrint.split(" ")
        for ((index, item) in words.withIndex()) {
            val color = colors[index % colors.size]
            println("${color}$item ${ColorsPrinter.RESET}")
        }
        println()
    }
}

//
class ShoppingCart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemsId: Int) {
        val amount = items[itemsId]
        if (amount == null) {
            items[itemsId] = 1
        } else {
            items[itemsId] = amount + 1
        }
    }

    fun addToCart(itemsId: Int, amount: Int) {
        for (i in 1 .. amount) {
            addToCart(itemsId)
        }
    }

    fun addToCart(items: Map<Int, Int>) {
        for (product in items) {
            addToCart(product.key, product.value)
        }
    }

    fun addToCart(items: List<Int>) {
        for (product in items) {
            addToCart(product)
        }
    }

    override fun toString(): String {
        var cartText = "Корзина товаров: \n"
        var cartArticle = "Итоговое количество артикулов: ${items.size}\n"
        var cartSum = "Общее количество товаров в корзине: ${items.values.sum()}"

        for (product in items) {
            cartText += "${product.key} | ${product.value}\n"
        }
        return cartText + cartArticle + cartSum
    }
}