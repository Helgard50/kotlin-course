package org.example.lessons.lessons14

import java.time.LocalDate
import java.time.Period

fun main() {
//    val person: Person = Person("John", 30)
//    person.sayHello()

    val reservedSeatCarriage = Carriage(48)
    val compartmentCarriage = Carriage(16, "Купе")
    val train = Train("Electric locomotive")
    train.carriages.add(reservedSeatCarriage)
    train.carriages.add(compartmentCarriage)
    val passengerAlexandr = Passenger("Alexandr", "02.10.1983", "")
    train.boardPassenger(passengerAlexandr, 10, "Купе")

    Logger.log("Application started")

    val result = Calculator.add(5, 3)
    Calculator.t = "bdg"
    println("Result: $result")

    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob")
    println(user1) // Output: User(id=1, name=Alice)
    println(user2) // Output: User(id=1, name=Bob)
}

data class User(val id: Int, val name: String)

class Calculator {
    companion object {
        var t = ""
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}


object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}

class Passenger(
    val name: String,
    private val dateOfBirth: String,
    private var phone: String
) {
    private var age: Int = calculateAge()
    private fun calculateAge(): Int {
        return Period.between(
            LocalDate.parse(dateOfBirth),
            LocalDate.now()
        ).years
    }
    fun recalculateAge() {
        age = calculateAge()
    }
}

class Carriage(val capacity: Int, val type: String = "Плацкарт") {
    private val passengers = mutableMapOf<Int, Passenger>()
    fun boardPassenger(passenger: Passenger, seat: Int) {
        if (passengers.size < capacity) {
            passengers[seat] = (passenger)
        }
    }
    fun passengerGetOff(seat: Int) {
        passengers.remove(seat)
    }
}
class Train(val engineType: String) {
    val carriages = mutableListOf<Carriage>()
    fun boardPassenger(
        passenger: Passenger,
        seat: Int,
        carriageType: String
    ) {
        // логика для размещения пассажира
    }
}