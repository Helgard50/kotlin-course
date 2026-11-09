package org.example.lessons.lessons18.homeworks

import java.io.InputStream

fun main() {
    println("=== Холодильник ===")
    val fridge = Fridge()
    fridge.powerOn()
    fridge.open()
    fridge.setTemperature(5)
    fridge.setTemperature(10) // превышение
    fridge.programAction("быстрое охлаждение")
    fridge.execute()
    fridge.cool()
    fridge.close()
    fridge.powerOff()
    fridge.setTemperature(3) // выключено — ошибка

    println("\n=== Стиральная машина ===")
    val washer = Washer()
    washer.connectToWaterSupply()
    washer.connectToDrain()
    washer.powerOn()
    washer.open()
    washer.fillWater(5)
    washer.setTemperature(60)
    washer.programAction("деликатная стирка")
    washer.execute()
    washer.getWater(2)
    washer.drain()
    washer.close()
    washer.powerOff()

    println("\n=== Чайник ===")
    val kettle = Kettle()
    kettle.powerOn()
    kettle.open()
    kettle.setTemperature(100)
    kettle.boil()
    kettle.close()
    kettle.powerOff()

    println("\n=== Духовка ===")
    val oven = Oven()
    oven.powerOn()
    oven.setTemperature(180)
    oven.programAction("выпечка 40 минут")
    oven.execute()
    oven.open()
    oven.bake()
    oven.close()
    oven.powerOff()
    oven.programAction("разогрев") // выключено — ошибка
}

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

// Задача 1
abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable

abstract class WashingMachine : Powerable, Openable, WaterContainer, WaterConnection,
    Drainable, Timable, Programmable

abstract class SmartLamp : Powerable, LightEmitting, Timable, Programmable

abstract class ElectronicClock : Powerable, Timable, BatteryOperated

abstract class RobotVacuumCleaner : Powerable, Movable, Cleanable, Rechargeable,
    AutomaticShutdown, Programmable

abstract class MechanicalClock : Mechanical, Timable

abstract class Flashlight : Powerable, LightEmitting, BatteryOperated

abstract class CoffeeMachine : Powerable, WaterContainer, WaterConnection, Timable,
    Programmable, Openable

abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, Timable

// Задача 2
abstract class PowerableDevice : Powerable {
    var isPoweredOn: Boolean = false
        private set

    override fun powerOn() {
        isPoweredOn = true
        println("${this::class.simpleName}: включено")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("${this::class.simpleName}: выключено")
    }
}

// Задача 3
abstract class ProgrammableDevice : PowerableDevice(), Programmable {
    protected var currentAction: String? = null

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("${this::class.simpleName}: невозможно запрограммировать действие — устройство выключено")
            return
        }
        currentAction = action
        println("${this::class.simpleName}: запрограммировано действие '$action'")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("${this::class.simpleName}: невозможно выполнить — устройство выключено")
            return
        }
        val action = currentAction
        if (action == null) {
            println("${this::class.simpleName}: нет запрограммированного действия")
        } else {
            println("${this::class.simpleName}: выполняю '$action'")
        }
    }
}

// Задача 4
abstract class TemperatureOpenableDevice :
    ProgrammableDevice(),
    TemperatureRegulatable,
    Openable {

    protected var isOpen: Boolean = false
        private set

    override fun open() {
        if (!isPoweredOn) {
            println("${this::class.simpleName}: невозможно открыть — устройство выключено")
            return
        }
        isOpen = true
        println("${this::class.simpleName}: открыто")
    }

    override fun close() {
        isOpen = false
        println("${this::class.simpleName}: закрыто")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("${this::class.simpleName}: невозможно установить температуру — устройство выключено")
            return
        }
        if (temp > maxTemperature) {
            println("${this::class.simpleName}: температура $temp превышает максимум $maxTemperature")
            return
        }
        println("${this::class.simpleName}: температура установлена на $temp°C")
    }
}

// Задача 5
class Fridge : TemperatureOpenableDevice() {
    override val maxTemperature: Int = 8

    fun cool() {
        if (!isPoweredOn) {
            println("Холодильник: невозможно охлаждать — устройство выключено")
            return
        }
        println("Холодильник: охлаждаю продукты")
    }
}

class Washer : TemperatureOpenableDevice(), WaterContainer, WaterConnection, Drainable, Timable {
    override val maxTemperature: Int = 90
    override val capacity: Int = 7  // литров
    private var currentWater: Int = 0

    override fun fillWater(amount: Int) {
        if (!isPoweredOn) {
            println("Стиральная машина: невозможно набрать воду — устройство выключено")
            return
        }
        currentWater = (currentWater + amount).coerceAtMost(capacity)
        println("Стиральная машина: набрано воды: $currentWater / $capacity л")
    }

    override fun getWater(amount: Int) {
        if (!isPoweredOn) {
            println("Стиральная машина: невозможно слить воду — устройство выключено")
            return
        }
        currentWater = (currentWater - amount).coerceAtLeast(0)
        println("Стиральная машина: осталось воды: $currentWater л")
    }

    override fun connectToWaterSupply() {
        println("Стиральная машина: подключена к водопроводу")
    }

    override fun connectToDrain() {
        println("Стиральная машина: подключена к канализации")
    }

    override fun drain() {
        if (!isPoweredOn) {
            println("Стиральная машина: невозможно слить воду — устройство выключено")
            return
        }
        currentWater = 0
        println("Стиральная машина: вода слита")
    }

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("Стиральная машина: невозможно установить таймер — устройство выключено")
            return
        }

        println("Стиральная машина: таймер установлен на $time минут")
    }
}

class Kettle : TemperatureOpenableDevice() {
    override val maxTemperature: Int = 100

    fun boil() {
        if (!isPoweredOn) {
            println("Чайник: невозможно вскипятить — устройство выключено")
            return
        }
        println("Чайник: кипячу воду")
    }
}

class Oven : TemperatureOpenableDevice() {
    override val maxTemperature: Int = 250

    fun bake() {
        if (!isPoweredOn) {
            println("Духовка: невозможно печь — устройство выключено")
            return
        }
        println("Духовка: готовлю блюдо")
    }
}