package org.example.lessons.lesson05.homeworks

fun main() {
    // Задача 1
    val initialIntensity: Double = 100.0
    val dampingCoefficient: Double? = null
    val actualCoefficient: Double = dampingCoefficient ?: 0.5
    val finalIntensity: Double = initialIntensity * actualCoefficient
    println(finalIntensity)

    //Задача 2
    val deliveryCost: Double = 20.0
    val cargoCost: Double? = null
    val actualCargoCost: Double = cargoCost ?: 50.0
    val insuranceCost: Double = actualCargoCost * 0.005
    val totalCost: Double = deliveryCost + insuranceCost
    println(totalCost)

    //Задача 3
    val atmosphericPressure: String? = null
    val errorMessage = "Error, atmospheric pressure is lost"
    val result = atmosphericPressure ?: errorMessage
    println(result)
}