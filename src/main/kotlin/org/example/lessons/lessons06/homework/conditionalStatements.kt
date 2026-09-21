package org.example.lessons.lessons06.homework

//Задание 1: "Определение сезона"
fun printSeasons (month: Int) {
    if (month !in 1..12) {
        println("Invalid month")
    } else if (month in 3..5) {
        println("Spring")
    } else if (month in 6..8) {
        println("Summer")
    } else if (month in 9..11) {
        println("Fall")
    } else {
        println("Winter")
    }
}

fun main() {
    val month: Int = 15
    printSeasons(month)
}

////Задание 2: "Расчет возраста питомца"
//fun printDogAge (dogAge : Int){
//    val ageUpTwo: Double = 10.5
//    val ageAfterTwo: Int = 4
//
//    if (dogAge <= 2) {
//        println(dogAge * ageUpTwo)
//    } else {
//        println(2 * ageUpTwo + (dogAge - 2) * ageAfterTwo)
//    }
//}
//
//fun main() {
//    val dogAge: Int = 10
//
//    printDogAge(dogAge)
//}
//
////Задание 3: "Определение способа перемещения"
//fun printMovementType(distance: Double) {
//    when {
//        distance <= 1 -> println("пешком")
//        distance <= 5 -> println("велосипед")
//        else -> println("автотранспорт")
//    }
//}
//
//fun main() {
//    val distance = 2.0
//
//    printMovementType(distance)
//}
//
////Задание 4: "Расчет бонусных баллов"
//fun printBonusPoints(purchaseAmount: Int) {
//    if (purchaseAmount <= 1000) {
//        println((purchaseAmount / 100) * 2)
//    } else {
//        println((purchaseAmount / 100) * 3)
//    }
//}
//
//fun main() {
//    val purchaseAmount: Int = 1500
//
//    printBonusPoints(purchaseAmount)
//}
//
////Задание 5: "Определение типа документа"
//fun printDocumentType(extension: String) {
//    when (extension) {
//        "txt", "doc", "docx" -> println("Текстовый документ")
//        "jpg", "jpeg", "png" -> println("Изображение")
//        "xls", "xlsx" -> println("Таблица")
//        else -> println("Неизвестный тип")
//    }
//}
//
//fun main() {
//    val extension: String = "png"
//
//    printDocumentType(extension)
//}
//
////Задание 6: "Конвертация температуры"
//fun convertTemperature(temperature: Double, unit: Char) {
//    when (unit) {
//        'C' -> {
//            val fahrenheit: Double = temperature * 9 / 5 + 32
//            print(fahrenheit)
//            print("F")
//        }
//
//        'F' -> {
//            val celsius: Double = (temperature - 32) * 5 / 9
//            print(celsius)
//            print("C")
//        }
//
//        else -> println("Неизвестная единица измерения")
//    }
//}
//
//fun main() {
//    val temperature: Double = 25.0
//    val unit: Char = 'C'
//
//    convertTemperature(temperature, unit)
//}
//
////Задание 7: "Подбор одежды по погоде"
//fun printClothingRecommendation(temperature: Int) {
//    when {
//        temperature < -30 || temperature > 35 ->
//            println("Не выходить из дома")
//
//        temperature < 10 ->
//            println("Куртка и шапка")
//
//        temperature in 10..18 ->
//            println("Ветровка")
//
//        else ->
//            println("Футболка и шорты")
//    }
//}
//
//fun main() {
//    val temperature: Int = 15
//
//    printClothingRecommendation(temperature)
//}
//
////Задание 8: "Выбор фильма по возрасту"
//fun printMovieCategory(age: Int) {
//    when (age) {
//        in 0..9 -> println("Детские")
//        in 10..18 -> println("Подростковые")
//        else -> println("18+")
//    }
//}
//
//fun main() {
//    val age: Int = 15
//
//    printMovieCategory(age)
//}