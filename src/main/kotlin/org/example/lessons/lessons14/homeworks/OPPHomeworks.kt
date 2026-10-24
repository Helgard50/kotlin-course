package org.example.lessons.lessons14.homeworks

fun main() {
    val party = Party("Moscow", 150)
    party.details()

    val emotion = Emotion("Смех", 8)
    emotion.express()

    Moon.showPhase()

    val product1 = Product("Bread", 100.60, 50)
    println(product1)

    val concert = Concert("GroupName", "Moscow", 100, 1000)
    println(concert)
}

//1
class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Месте проведения - $location, количестве гостей - $attendees")
    }
}

//2
class Emotion(val type: String,  val intensity: Int) {
    fun express() {
        when {
            intensity <= 5 -> println("Слабая эмоция: $type")
            intensity <= 10 -> println("Сильная эмоция: $type")
            else -> println("Истерия")
        }
    }
}

//3
object Moon {
    val isVisible: Boolean = true
    val phase: String = "New Moon"

    fun showPhase() {
        println("Фаза Луны: $phase")
    }
}

//4
data class Product(val name: String, var price: Double, var count: Int)

//5
class Concert(val group: String, val place: String, val price: Int, val capacity: Int) {
    private var soldTickets: Int = 0

    fun printPlace() {
        println("Название группы: $group. Место проведения: $place, Цена: $price. Вместимость: $capacity")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
        } else {
            println("Билеты проданы")
        }
    }
}

//6
class Shelf(val capacity: Int) {

    private val items = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) {
            return false
        }
        items.add(name)
        return true
    }

    fun removeItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }
        items.remove(name)
        return true
    }

    fun canAccommodate(name: String): Boolean {
        val currentAccommodation = items.map {
            it.length
        }.sum()
        return currentAccommodation + name.length <= capacity
    }

    fun containsItem(name: String) = items.contains(name)

    fun getItems() = items.toList()
}
class Rack(private val maxShelves: Int) {

    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.contains(shelf) || shelves.size == maxShelves) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val items = shelves[index].getItems()
        shelves.removeAt(index)
        return items
    }

    fun addItem(name: String): Boolean {
        if (shelves.isEmpty()) {
            return false
        }
        for (shelf in shelves) {
            if (shelf.canAccommodate(name)) {
                return shelf.addItem(name)
            }
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(name)) {
                return shelf.removeItem(name)
            }
        }
        return false
    }

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun getShelves() = shelves.toList()

    fun printContents() {
        for (i in shelves.indices) {
            val capacity = shelves[i].capacity
            val accessiblePlace = capacity - shelves[i].getItems()
                .map { it.length }
                .sum()
            val meta = "$i вместимость: $capacity доступно: $accessiblePlace"
            val items = shelves[i].getItems().joinToString()
            println(meta)
            println("Предметы: $items")
            println()
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val notReplacedItems = mutableListOf<String>()
        val otherShelves = shelves - shelves[index]
        for (item in shelves[index].getItems()) {
            if (otherShelves.none { it.addItem(item) }) {
                notReplacedItems.add(item)
            }
        }
        shelves.removeAt(index)
        return notReplacedItems.toList()
    }
}