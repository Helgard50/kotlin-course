package org.example.lessons.lessons09.homeworks

////Работа с массивами Array
////1
//val exampleArrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//
////2
//val exampleEmptyArray: Array<String> = Array(10) { "" }
//
////3
//val exampleDoubleArray = DoubleArray(5)
//fun main() {
//    for (example in exampleDoubleArray.indices) {
//        exampleDoubleArray[example] = (example * 2).toDouble()
//    }
//    println(exampleDoubleArray.contentToString())
//}
//
////4
//val exampleArrayInt2 = IntArray(5)
//fun main() {
//    for (item in exampleArrayInt2.indices) {
//        exampleArrayInt2[item] = item * 3
//    }
//    println(exampleArrayInt2.contentToString())
//}
//
////5
//val nullableArray: Array<String?> = arrayOf(null, "String1", "String2")
//
////6
//val arrayInt1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//val arrayInt2 = IntArray(5)
//fun main() {
//    for (i in arrayInt1.indices){
//        arrayInt2[i] = arrayInt1[i]
//    }
//    println(arrayInt2.contentToString())
//}
//
////7
//fun main() {
//    val arrayInt1: Array<Int> = arrayOf(24, 40, 50, 109)
//    val arrayInt2: Array<Int> = arrayOf(36, 35, 45, 100)
//    val arrayInt3 = Array<Int>(4) { 0 }
//
//    for (i in arrayInt1.indices) {
//        arrayInt3[i] = arrayInt1[i] - arrayInt2[i]
//    }
//    for (i in arrayInt3) {
//        println(i)
//    }
//}
//
////8
//fun main() {
//    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    var index = 0
//    var resultIf = -1
//
//    while (index < arrayInt.size) {
//        if (arrayInt[index] == 5) {
//            resultIf = index
//            break
//        }
//        index++
//    }
//    println(resultIf)
//}
//
////9
//fun main() {
//    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    for (i in arrayInt) {
//        if (i % 2 == 0) {
//            println("$i - чётное")
//        }
//        else {
//            println("$i - нечётное")
//        }
//    }
//}
//
////10
//fun arrayTextSearch (text: Array<String>, search: String) {
//    for (result in text) {
//        if (result.contains(search)) {
//            println(result)
//        }
//    }
//}
//
////Работа со списками List
////1
//val emptyList: List<Int> = emptyList()
//
////2
//val stringList: List<String> = listOf("Hello", "World", "Kotlin")
//
////3
//val mutableListInt: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
//
////4
//fun main() {
//    val mutableListInt1: MutableList<Int> = mutableListOf()
//    mutableListInt1.addAll(listOf(6, 7, 8))
//    println(mutableListInt1)
//}
//
////5
//fun main() {
//    val mutableListString: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
//    mutableListString.remove("World")
//    println(mutableListString)
//}
//
////6
//fun main() {
//    val intList: List<Int> = listOf(1, 2, 3, 4, 5)
//    for (item in intList) {
//      println(item)
//    }
//}
//
////7
//fun main() {
//    val stringList1: List<String> = listOf("Hello", "World", "Kotlin")
//    println(stringList1[1])
//}
//
////8
//fun main() {
//    val mutableListInt2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
//    mutableListInt2[2] = 100
//    println(mutableListInt2)
//}
//
////9
//fun main() {
//    val stringList2: List<String> = listOf("Hello", "World", "Kotlin")
//    val stringList3: List<String> = listOf("Good", "Bad", "Program")
//    val stringList4: MutableList<String> = mutableListOf()
//
//    for (i in stringList2.indices) {
//        stringList4.add(stringList2[i] + stringList3[i])
//    }
//    println(stringList4)
//}
//
////10
//fun main() {
//    val numbers: List<Int> = listOf(7, 2, 15, 4, 9, 1)
//    var min = numbers[0]
//    var max = numbers[0]
//
//    for (number in numbers) {
//        if (number < min) {
//            min = number
//        }
//
//        if (number > max) {
//            max = number
//        }
//    }
//
//    println("Минимальный: $min")
//    println("Максимальный: $max")
//}
//
////11
//fun main() {
//    val listInt5: List<Int> = listOf(1, 4, 7, 8, 10, 13, 16)
//    val numbers: MutableList<Int> = mutableListOf()
//
//    for (number in listInt5) {
//        if (number % 2 == 0) {
//            numbers.add(number)
//        }
//    }
//
//    println(numbers)
//}
//
////Работа с Множествами Set
////1
//val set: Set<Int> = setOf()
//
////2
//val set: Set<Int> = setOf(1, 2, 3)
//
////3
//val set: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
//
////4
//fun main() {
//    val set1: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
//    set1.add("Swift")
//    set1.add("Go")
//    println(set1)
//}
//
////5
//fun main() {
//    val set2: MutableSet<Int> = mutableSetOf(1, 2, 3)
//    set2.remove(2)
//    println(set2)
//}
//
////6
//fun main() {
//    val set3: Set<Int> = setOf(1, 2, 3)
//
//    for (number in set3) {
//        println(number)
//    }
//}
//
////7
//fun checkString(set: Set<String>, text: String): Boolean {
//    for (element in set) {
//        if (element == text) {
//            return true
//        }
//    }
//    return false
//}
//
////8
//fun main() {
//    val set4: Set<String> = setOf("Kotlin", "Java", "Scala")
//    val list: MutableList<String> = mutableListOf()
//
//    for (element in set4) {
//        list.add(element)
//    }
//
//    println(list)
//}
