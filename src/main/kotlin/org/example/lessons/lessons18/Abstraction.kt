package org.example.lessons.lessons18

interface Programmable {

    fun selectProgram(preset: Int)
}

class Microwave(
    brand: String,
    serialNumber: String
) : HouseholdAppliance(brand), Programmable {

    private val programPresets = mapOf(
        1 to "warm up soup",
        2 to "warm up bread"
    )

    private var lastProgram = 1

    override val deviceId = serialNumber

    override val applianceType: String = "Микроволновая печь"

    override fun operate() {
        if (isPoweredOn) {
            invokeProgram()
            performMaintenance()
        } else {
            println("Микроволновая печь от $brand не включена. Пожалуйста, включите ее.")
        }
    }

    override fun performMaintenance() {
        super.performMaintenance()
        println("Чистка микроволновой печи от $brand.")
    }

    override fun selectProgram(preset: Int) {
        if (preset in programPresets) {
            lastProgram = preset
        }
    }

    private fun invokeProgram() {
        println(programPresets[lastProgram])
    }
}

fun main() {
    val mw = Microwave("Samsung", "CX45HGR-T10")
    println(mw.isPoweredOn)
    // mw.isPoweredOn = true // так нельзя
    println(mw.deviceId)
    mw.turnOn()
    mw.operate()
    mw.restart()
    mw.operate()
    mw.turnOff()
}