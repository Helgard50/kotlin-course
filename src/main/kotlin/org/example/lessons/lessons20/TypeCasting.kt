package org.example.lessons.lessons20

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}

fun String.removeSpaces(): String {
    return this.replace(" ", "")
}

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}

fun main() {
    val result1 = removeSpaces("String with spaces")
    val result = "Hello, World!".removeSpaces() // "Hello,World!"
    println(result)

    val list: List<String?> = listOf(null, "")
    val isEmpty = list.isElementsNullOrEmpty() // false
    println(isEmpty)
    val t = "  gig ".trim()
        .removeSpaces()
    println(t)
}