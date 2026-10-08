package org.example.lessons.lessons10.homeworks

//Задачи на работу со словарём
//1
val emptyMap: Map<Int, Int> = mapOf()

//2
val floatDoubleMap: Map<Float, Double> = mapOf(23.51f to 0.1234, 12.67f to 0.56903)

//3
val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one")

//4
val mutableMapAdd: MutableMap<String, String> = mutableMapOf("Ключ1" to "Значение1")
//fun main() {
//    mutableMapAdd["Ключ2"] = "Значение2"
//    println(mutableMapAdd)
//}

//5
//fun main() {
//    val keyMy = mutableMapAdd["Ключ3"]
//    if (keyMy in mutableMapAdd) {
//        println(keyMy)
//    } else {
//        println("Not found")
//    }
//}

//6
val deleteMap: MutableMap<Int, String> = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//fun main() {
//    deleteMap.remove(2)
//    println(deleteMap)
//}

//7
val cycleMap: Map<Double, Int> = mapOf(0.1 to 23, 0.3 to 56, 0.5 to 0)
//fun main() {
//    for ((itemDouble, itemInt) in cycleMap) {
//        if (itemInt == 0) {
//            println("бесконечность")
//        } else {
//            println(itemDouble / itemInt)
//        }
//    }
//}

//8
val map: MutableMap<Int, String> = mutableMapOf(1 to "item1", 2 to "item2", 3 to "item3")
//fun main() {
//    map[2] = "item2.1"
//    println(map)
//}

//9
val mapOne: Map<String, String> = mapOf("item1" to "a", "item2" to "b")
val mapTwo: Map<String, String> = mapOf("item3" to "c", "item4" to "d")
val mapTree: MutableMap<String, String> = mutableMapOf()
//fun main() {
//    for ((key, value) in mapOne) {
//        mapTree[key] = value
//    }
//    for ((key, value) in mapTwo) {
//        mapTree[key] = value
//    }
//    println(mapTree)
//}

//10
val mapStrInt: MutableMap<String, Int> = mutableMapOf()
//fun main() {
//    mapStrInt["i"] = 1
//    mapStrInt["b"] = 2
//    mapStrInt.putAll(mapOf("c" to 4, "r" to 150))
//    println(mapStrInt)
//}

//11
val mapSet: MutableMap<Int, MutableSet<String>> = mutableMapOf(1 to mutableSetOf("a", "b", "c"), 2 to mutableSetOf("q", "g", "p"))
//fun main() {
//    mapSet[3] = mutableSetOf("l", "u")
//    val setFromMap = mapSet[2]
//    setFromMap?.add("t")
//  println(setFromMap)
//}

//12
val mapIntTwo: Map<Pair<Int, Int>, Int> = mapOf(Pair(1, 5) to 15, Pair(4, 6) to 46, Pair(5, 9) to 59, Pair(7, 9) to 759)
//fun main() {
//    for ((key, value) in mapIntTwo) {
//        if (key.first == 5 || key.second == 5)
//            println(value)
//    }
//}

//Задачи на подбор оптимального типа для словаря
//1
val mapLibrary: MutableMap<String, MutableSet<String>> = mutableMapOf("autor" to mutableSetOf("book1", "book2"))
//2
val mapPlants: MutableMap<String, MutableList<String>> = mutableMapOf("type" to mutableListOf("plants1", "plants2"))
//3
val mapPlayers: Map<String, List<String>> = mapOf("teamName" to listOf("players1", "players2"))
//4
val mapMedicines: Map<String, List<String>> = mapOf("date" to listOf("medicines1", "medicines2"))
//5
val mapTravel: MutableMap<String, MutableMap<String, String>> = mutableMapOf("country" to mutableMapOf("city" to "places"))