package org.example.lessons.lessons12.homeworks

//1
val numbers = mutableListOf<Int>(1, 2, -3, 4, -5, 8, 264, -50, 100)
val numbers1 = listOf<String?>("one", null, "two", null)
val numbers2 = listOf<String>("one", "two", "tree", "four", "five")
val emptyList = listOf<Any>()
val numbers3 = listOf<Int>(1, 1, 2, 2, 3, 3, 4, 4)
val numbers4 = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

fun moreThenFive() {
    if (numbers.size > 5) {
        println("More than 5")
    } else {
        println("Less than 5")
    }
}

//2
fun listIsEmpty() {
    if (emptyList.isEmpty()) {
        println("List is empty")
    } else {
        println("List isn't empty")
    }
}

//3
fun listIsNotEmpty() {
    if (numbers.isNotEmpty()) {
        println("List isn't empty")
    } else {
        println("List is empty")
    }
}

//4
fun elementIndex() {
    val element = numbers.getOrElse(9) {222}
    if (9 !in numbers.indices) {
        numbers.add(222)
    }
    println(numbers)
}

//5
fun fromIntToString() {
    val example: String = numbers.joinToString()
        println(example)
}

//6
fun sumList() {
    val sumCollection = numbers.sum()
    println(sumCollection)
}

//7
fun averageFromList() {
    val averageCount = numbers.average()
    println(averageCount)
}

//8
fun maxNumbers() {
    val maxInList = numbers.maxOrNull()
    println(maxInList)
}

//9
fun minNumbers() {
    val minInList = numbers.minOrNull()
    println(minInList)
}

//10
fun firstOrNullInList() {
    val firstNullInList = numbers.firstOrNull()
    println(firstNullInList)
}

//11
fun containsElement() {
    if (numbers.contains(19)) {
        println("Element is in collection")
    } else {
        println("Element isn't in collection")
    }
}

//12
fun filterOne() {
    val filtered1 = numbers.filter {
        it in 1..10
    }
    println(filtered1)
}

//13
fun filterTwo() {
    val filtered2 = numbers.filterNot {
        it % 2 == 0 && it % 3 == 0
    }
    println(filtered2)
}

//14
fun filterTree() {
    val feltered3 = numbers1.filterNotNull()
    println(feltered3)
}

//15
fun mapCollectionOne() {
    val stringMap = numbers2.map { it.length }
    println(stringMap)
}

//16
fun mapCollectionTwo() {
    val map1 = numbers2.associate {
it.reversed() to it.length
    }
    println(map1)
}

//17
fun sortedOne() {
    val sorted1 = numbers2.sorted()
    println(sorted1)
}

//18
fun firstElementOne() {
    val first1 = numbers.take(3)
    println(first1)
}

//19
fun mapCollectionTree() {
    val map3 = numbers.map { it * it }
    println(map3)
}

//20
fun groupList() {
    val group1 = numbers2.groupBy { it.first() }
    println(group1)
}

//21
fun duplicateDelete() {
    val distinct1 = numbers3.distinct()
    println(distinct1)
}

//22
fun sortedTwo() {
    val sorted2 = numbers.sortedDescending()
    println(sorted2)
}

//23
fun lastElement() {
    val takelast1 = numbers.takeLast(3)
    println(takelast1)
}

//24
fun collectionInt(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.first() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.max() < -10 -> "Отрицательная"
        numbers.min() > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

//25
val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
fun gradesList(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

//26
val list = listOf(
    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
)
fun catalogGroupBy(value: List<String>): Map<Char, List<String>> {
    return list
        .map { it.lowercase() }
        .groupBy { it.first() }
}

//27
fun listAverageLength(value: List<String>, format: Double.(String) -> String): String {
    val averageLenght = value.map { it.length }.average()
    return averageLenght.format("%.2f")
}

//28
fun groupNumbers(numbers: List<Int>): Map<String, List<Int>> {
    val uniqueNumbers = numbers4.distinct().sortedDescending()
    return uniqueNumbers.groupBy {
        if (it % 2 == 0) "четные" else "нечетные"
    }
}

fun main() {
//    println(moreThenFive())
//    println(listIsEmpty())
//    println(listIsNotEmpty())
//    println(elementIndex())
//    println(fromIntToString())
//    println(sumList())
//    println(averageFromList())
//    println(maxNumbers())
//    println(minNumbers())
//    println(firstOrNullInList())
//    println(containsElement())
//    println(filterOne())
//    println(filterTwo())
//    println(filterTree())
//    println(mapCollectionOne())
//    println(mapCollectionTwo())
//    println(sortedOne())
//    println(firstElementOne())
//    println(mapCollectionTree())
//    println(groupList())
//    println(duplicateDelete())
//    println(sortedTwo())
//    println(lastElement())
//    println(gradesList(grades))
//    println(catalogGroupBy(list))
//    println(listAverageLength(list))
//    println(groupNumbers())
}