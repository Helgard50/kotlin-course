package org.example.lessons.lessons08.homeworks

import kotlin.text.lowercase

//1. Преобразование строк

//fun main() {
//    example("Это невозможно выполнить за один день")
//    example("Я не уверен в успехе этого проекта")
//    example("Произошла катастрофа на сервере")
//    example("Этот код работает без проблем")
//    example("Удача")
//}
////
//fun example(phrase: String) {
//    val result = when {
//        phrase.contains("невозможно") -> phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
//        phrase.startsWith("Я не уверен") -> "$phrase, но моя интуиция говорит об обратном"
//        phrase.contains("катастрофа") -> phrase.replace("катастрофа", "интересное событие")
//        phrase.endsWith("без проблем") -> phrase.replace("без проблем", "с парой интересных вызовов на пути")
//        phrase.contains("Удача") -> "Иногда, $phrase, но не всегда"
//        else -> phrase
//    }
//    println(result)
//}

//2.Извлечение даты из строки лога
//fun main() {
//    val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
//
//    val datePart = log.split(" -> ")[1]
//
//    val date = datePart.split(" ")[0]
//    val time = datePart.split(" ")[1]
//
//    println(date)
//    println(time)
//}

//3. Маскирование личных данных
//fun main() {
//    val cardNumber = "4539 1488 0343 6467"
//
//    val lastFour = cardNumber.substring(15)
//    val hide = "*".repeat(cardNumber.length - 4) + lastFour
//
//    println(hide)
//}

//4. Форматирование адреса электронной почты.
//fun main() {
//    val email = "username@example.com"
//
//    val result = email.replace("@", " [at] ").replace(".", " [dot] ")
//
//    println(result)
//}

//5. Извлечение имени файла из пути.
//fun main() {
//    val path = "C:/Пользователи/Документы/report.txt"
//
//    val fileName = path.split("/")[3]
//
//    println(fileName)
//}

//6. Создание аббревиатуры из фразы.
//fun main() {
//    val phrase = "Котлин лучший язык программирования"
//
//    val words = phrase.split(" ")
//
//    var abbreviation = ""
//
//    for (word in words) {
//        abbreviation += word.first()
//    }
//
//    println(abbreviation)
//}


