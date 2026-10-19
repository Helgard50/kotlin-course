package org.example.lessons.lessons13.homeworks

import kotlin.collections.forEach

//1
val mapOne = mapOf<String, Int>("test1" to 25, "test2" to 12, "test3" to 54, "test4" to 2, "test5" to 33)
val mapTwo = mapOf<String, String>("name1" to "metadata0", "name2" to "metadata1", "name3" to "metadata2")
val mapTree = mutableMapOf<String, Int>("test1" to 25, "test2" to 12, "test3" to 54, "test4" to 2, "test5" to 33)
val mapFour = mapOf<String, String>("test1" to "passed", "test2" to "skipped", "test3" to "failed", "test4" to "passed", "test5" to "failed")
val mapFive = mutableMapOf<String, String>("bag1" to "open", "bag2" to "fixed", "bag3" to "rejected", "bag4" to "open", "bag5" to "fixed")
val mapSix = mapOf<String, Int>("https://example1.com" to 200, "https://example2.com" to 404, "https://example3.com" to 502)
val mapSeven = mapOf<String, String>("/endpoint1" to "200 OK", "/endpoint2" to "404 Not Found", "/endpoint3" to "500 Internal Server Error",)
val mapEight = mapOf<String, Int>("service1" to 120, "service2" to 200, "service3" to 650, "service4" to 1050)
val mapNine = mapOf<String, String>("name1" to "configuration1", "name2" to "configuration2", "name3" to "configuration3")
val mapTen = mapOf<String, String>("OS1" to "MacOs", "OS2" to "Windows")

fun averageTestTime() {
    val averageTime = mapOne.values.average()
    println(averageTime)
}

//2
fun allKeyMap() {
    val allKeyFromMap = mapTwo.keys
    println(allKeyFromMap)
}

//3
fun addNewTest() {
    mapTree["test6"] = 1504
    println(mapTree)
}

//4
fun countTest() {
    val countPassed = mapFour.count { it.value == "passed" }
    println(countPassed)
}

//5
fun deleteBag() {
    mapFive.values.remove("fixed")
    println(mapFive)
}

//6
fun printEach() {
    mapSix.forEach { key, value ->
        println("$key:  $value")
    }
}

//7
fun timeService() {
    val responceTime = mapEight.filter { it.value > 300 }
    println(responceTime)
}

//8
fun apiFunction() {
    val status = mapSeven.getOrElse("/endpoint6") {"Не протестирован"}
    println(status)
}

//9
fun configurationFun() {
    val browserType = mapNine.getValue("name1")
    println(browserType)
}

//10
fun addNewOS() {
    val newMap = mapTen + ("OS3" to "Linux")
    println(newMap)
}

fun main() {
//    println(averageTestTime())
//    println(allKeyMap())
//    println(addNewTest())
//    println(countTest())
//    println(deleteBag())
//    println(printEach())
//    println(apiFunction())
//    println(timeService())
//    println(configurationFun())
    println(addNewOS())
}