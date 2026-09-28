package org.example.lessons.lessons08

val simpleString = "Это простая строка"

val firstName = "Иван"
val lastName = "Иванов"
val fullName = firstName + " " + lastName

val age = 30
val greeting = "Привет! Меня зовут $firstName, и мне $age лет."

class Person(val name: String, val age: Int)

val person = Person(name = "Алексей", age = 25)
val introduction = "Меня зовут ${person.name}, и мне ${person.age} лет."

//fun getDetails(): String {
//    return "очень интересные детали"
//}

//val details = "Здесь находятся ${getDetails()}"

val originalString = "Kotlin is fun"
val subString = originalString.substring(startIndex = 7) //is fun
val subString2 = originalString.substring(3, 6) //lin
val replacedString = originalString.replace(oldValue = "fun", newValue = "awesome") //Kotlin is awesome
val words = originalString.split(" ") //["Kotlin", "is", "fun"]
val length = "Hello".length // 5
val upper = "hello".uppercase() //"HELLO"
val lower = "HELLO".lowercase() //"hello"
val trimmed = " hello ".trim() //"hello"
val starts = "Kotlin".startsWith("Kot") //true
val ends = "Kotlin".endsWith("lin") //true
val contains = "Hello".contains("ello") //true
val empty = "".isNullOrEmpty() //true
val blank = " ".isNullOrBlank() //true
val repeat = "ab".repeat(3) //"ababab"
val letter = originalString[5] //'n'
val indexOfChar = "Kotlin".indexOf('t') //2
val indexOfWord = "Kotlin is the best language".indexOf("best") //14
val backReverse = "niltoK".reversed() //"Kotlin"

val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
""".trimIndent()
val dt = """
    fjkwbjbjfq
    qjkqbfkqfq
       fkbqlkfblkqf
       
       dqlqkdqlkqknlndl
       
  .,f q.,fn,.qnlfqnl
""".trimIndent()

fun main() {
    val name = "Алексей"
    val city = "Москва"
    val age = 32
    val friendsCount = 1052
    val rating = 4.948
    val balance = 2534.75856
    val text = """
        Имя: %s
        Город: %s
        Возраст: %d
        Количество друзей: %,d
        Рейтинг пользователя: %.1f
        Баланс счета: $%,.2f
    """.trimIndent()
    println(text.format(name, city, age, friendsCount, rating, balance))
}
