package org.example.lessons.lessons13

fun main() {
    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for ((key, value) in fruitsPrices) {
        println("Key: $key, Value: $value")
    }

    val entries = fruitsPrices.entries
    val keys = fruitsPrices.keys
    val values = fruitsPrices.values
    println(entries)
    println(keys)
    println(values)

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { 9999.99 }
    val priceOfApple = fruitsPrices.getValue("apple")
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)

    val fruitsWithoutBanana = fruitsPrices - "banana" // создание нового словаря в котором нет "banana"
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // создание нового словаря с дополнительной парой
    val mutableFruits = fruitsPrices.toMutableMap() // Создание нового изменяемого словаря с теми же значениями
    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // Добавление словаря
    mutableFruits + mapOf("lime" to 1.1, "avocado" to 1.9) // Не добавляет данные в существующий словарь а создаёт новый, в который включены данные из обоих словарей
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // Очистка словаря

    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 }
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }

    val toMap = mutableFruits.toMap()
    val toMutableMap = fruitsPrices.toMutableMap()

    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit costs $price")
    }

    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}")
    }

    fruitsPrices.size // количество ключей
    fruitsPrices.count() // тоже количество ключей
    fruitsPrices.count { it.value > 2 } // количество ключей если сначала применить фильтрацию по условию
}