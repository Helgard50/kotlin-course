package org.example.lessons.lessons21.homeworks

//Задание 1:
fun analyzeDataType(data: Any) {
    when (data) {
        is String -> println("Это строка: $data")
        is Number -> println("Это число: $data")
        is List<*> -> println("Это список, количество элементов: ${data.size}")
        is Map<*, *> -> println("Это словарь, количество пар: ${data.size}")
        else -> println("Неизвестный тип данных")
    }
}

//Задание 2:
fun safeCastToList(data: Any): Int {
    val list = data as? List<*>
    return list?.size ?: -1
}

//Задание 3:
fun getStringLengthOrZero(data: Any?): Int {
    val string = data as? String
    return string?.length ?: 0
}

//Задание 4:
fun Any.toSquare(): Double {
    val number = when (this) {
        is Number -> this.toDouble()
        is String -> this.toDouble()
        else -> 0.0
    }
    return number * number
}

//Задание 5:
fun sumIntOrDoubleValues(list: List<Any>): Double {
    var sum = 0.0
    for (element in list) {
        when (element) {
            is Int -> sum += element
            is Double -> sum += element
        }
    }
    return sum
}

//Задание 6:
fun tryCastToListAndPrint(data: Any) {
    val list = data as? List<*>
    if (list != null) {
        for (element in list) {
            if (element is String) {
                println(element)
            } else {
                println("Предупреждение: элемент $element не является строкой")
            }
        }
    } else {
        println("Ошибка: переданный объект не является списком")
    }
}