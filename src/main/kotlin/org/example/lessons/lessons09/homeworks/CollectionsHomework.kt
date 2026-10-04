package org.example.lessons.lessons09.homeworks

//Работа с массивами Array
//1
val exampleArrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//2
val exampleEmptyArray: Array<String> = Array(10) {""}

//3
//val exampleDoubleArray = DoubleArray(5)
//fun main() {
//    for (example in exampleDoubleArray.indices) {
//        exampleDoubleArray[example] = (example * 2).toDouble()
//    }
//    println(exampleDoubleArray.contentToString())
//}

//4
//val exampleArrayInt2 = IntArray(5)
//fun main() {
//    for (item in exampleArrayInt2.indices) {
//        exampleArrayInt2[item] = item * 3
//    }
//    println(exampleArrayInt2.contentToString())
//}

//5
//val nullableArray: Array<String?> = arrayOf(null, "String1", "String2")

//6
//val arrayInt1: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//val arrayInt2 = IntArray(5)
//fun main() {
//    for (i in arrayInt1.indices){
//        arrayInt2[i] = arrayInt1[i]
//    }
//    println(arrayInt2.contentToString())
//}

//7
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

//8
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

//9
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

//10
//fun arrayTextSearch (text: Array<String>, search: String) {
//    for (result in text) {
//        if (result.contains(search)) {
//            println(result)
//        }
//    }
//}
