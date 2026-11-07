package org.example.lessons.lessons17

class Lamp() {
    var isTurnedOn: Boolean = false
        private set
    fun TurnedOn() {
        isTurnedOn = true
    }
    fun TurnedOff() {
        isTurnedOn = false
    }
    fun geIsTurnedOn(): Boolean {
        return isTurnedOn
    }
}

class GameConsole() {
    fun startGame(gameName: String) {
        initializeHardware()
        loadGame(gameName)
    }
    private fun initializeHardware() {
        println("Hardware initialized")
    }
    private fun loadGame(gameName: String) {
        println("Load '$gameName'")
        println("Game '$gameName' started")
    }
}