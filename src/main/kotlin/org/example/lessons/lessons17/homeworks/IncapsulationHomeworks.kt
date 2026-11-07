package org.example.lessons.lessons17.homeworks

fun main() {
    //1
    val slotMachine = SlotMachine()
    slotMachine.switchOn()
    println(slotMachine.switchedOnOff)
    slotMachine.switchOff()
    println(slotMachine.switchedOnOff)
    slotMachine.osStart()
    println(slotMachine.osStatus)
    slotMachine.osEnd()
    println(slotMachine.osStatus)
    println(slotMachine.printGameList())
    println(slotMachine.startGame(
        gameName = "game1"
    ))
    println(slotMachine.payForGame())
    println(slotMachine.enterPin(2345))
    println(slotMachine.openSafeAndGiveCash())
    //2
    val child = ChildrenClass("privateVal", "protectedVal", "publicVal")
    child.publicField = "Антонио Бандерас"
    child.newProtectedField("newProtected")
    println(child.getAll())
    child.printText()
}

//1. Игровой автомат
class SlotMachine(
    val color: String = "Blue",
    val model: String = "Nova",
    val gamesList: List<String> = listOf("game1", "game2", "game3"),
    val gamepad: Boolean = true,
    private var balance: Int = 0,
    private val owner: String = "Owner",
    val supportPhone: String = "+70001112345",
    private var paid: Boolean = false,
    val price: Int = 100,
    private val pinCode: Int = 1234,
    var gameOn: Boolean = false,
    private var pinCheck: Boolean = false
    ) {
    var switchedOnOff: Boolean = false
        private set
    var osStatus: Boolean = false
        private set

    fun switchOn() {
        switchedOnOff = true
    }
    fun switchOff() {
        switchedOnOff = false
    }
    fun osStart() {
        osStatus = true
    }
    fun osEnd() {
        osStatus = false
    }
    fun printGameList(): List<String> {
        return gamesList
    }
    fun startGame(gameName: String): Boolean {
        if (
            switchedOnOff &&
            osStatus &&
            paid &&
            gamesList.contains(gameName)
        ) {
            gameOn = true
        }
        return true
    }
    fun payForGame(): Boolean {
        if (paid) {
            return false
        }
        balance += price
        paid = true
        return true
    }
    fun enterPin(pin: Int): Boolean {
        pinCheck = pin == pinCode
        return pinCheck
    }
    fun openSafeAndGiveCash(): Int? {
        if (!pinCheck) {
            return null
        }
        val cash = balance
        return cash
    }
}

//2. Почемучка
abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass - так как ChildrenClass объявляет свою переменную privateVal.
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main() - protected ограничивает применение переменной внутри класса и в производных классах.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. объясни, почему эта функция не может быть публичной - так как она возвращает ProtectedClass, который объявлен как protected.
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст - потому что она переопределена в ChildrenClass.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    // 9. объясни, почему эта функция не может быть публичной или protected - так как она возвращает PrivateClass, который объявлен как private.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле - он передаётся в конструктор ChildrenClass как аргумент.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет - потому что она наследуется из BaseClass.
    // 12. проверь, что выводится на печать при вызове функции printText() - private-методы не наследуются дочерним классом и не могут быть переопределены через override
    // и объясни, почему не происходит переопределение метода privatePrint()
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
    override fun verifyPublicField(value: String): Boolean = true

    fun newProtectedField(value: String) {
        protectedField = value
    }
}
