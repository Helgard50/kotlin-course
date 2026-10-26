package org.example.lessons.lessons15.homeworks

//1 Геометрические Фигуры
open class GeometricFigure(
    val color: String
) {
    open fun getDescription(): String {
        return "Геометрическая фигура, цвет: $color"
    }
}

open class Polygon(
    color: String,
    val numberOfSides: Int
) : GeometricFigure(color)

class Triangle(
    color: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon(color, numberOfSides = 3)

class Quadrilateral(
    color: String,
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val sideD: Double
) : Polygon(color, numberOfSides = 4)

class Circle(
    color: String,
    val radius: Double
) : GeometricFigure(color) {
    fun getArea(): Double {
        return Math.PI * radius * radius
    }
}

//2 Учебные Заведения
open class EducationalInstitution(
    val name: String,
    val city: String
) {
    open fun getDescription(): String {
        return "$name, город: $city"
    }
}

open class School(
    name: String,
    city: String,
    val numberOfStudents: Int
) : EducationalInstitution(name, city)

class PublicSchool(
    name: String,
    city: String,
    numberOfStudents: Int,
    val schoolNumber: Int
) : School(name, city, numberOfStudents)

class PrivateSchool(
    name: String,
    city: String,
    numberOfStudents: Int,
    val tuitionFee: Double
) : School(name, city, numberOfStudents)

open class University(
    name: String,
    city: String,
    val numberOfFaculties: Int
) : EducationalInstitution(name, city)

class MedicalUniversity(
    name: String,
    city: String,
    numberOfFaculties: Int,
    val hasTeachingHospital: Boolean
) : University(name, city, numberOfFaculties)

class TechnicalUniversity(
    name: String,
    city: String,
    numberOfFaculties: Int,
    val engineeringProgramsCount: Int
) : University(name, city, numberOfFaculties)

//3 Иерархия Мебели
open class Furniture(
    val material: String,
    val color: String
) {
    open fun getDescription(): String {
        return "Материал: $material, цвет: $color"
    }
}

open class Chair(
    material: String,
    color: String,
    val numberOfLegs: Int
) : Furniture(material, color)

class OfficeChair(
    material: String,
    color: String,
    numberOfLegs: Int,
    val hasWheels: Boolean
) : Chair(material, color, numberOfLegs)

class DiningChair(
    material: String,
    color: String,
    numberOfLegs: Int,
    val hasArmrests: Boolean
) : Chair(material, color, numberOfLegs)

open class Table(
    material: String,
    color: String,
    val numberOfLegs: Int,
    val height: Double
) : Furniture(material, color)

class DiningTable(
    material: String,
    color: String,
    numberOfLegs: Int,
    height: Double,
    val seatsCount: Int
) : Table(material, color, numberOfLegs, height)

class Desk(
    material: String,
    color: String,
    numberOfLegs: Int,
    height: Double,
    val hasDrawers: Boolean
) : Table(material, color, numberOfLegs, height)

open class Sofa(
    material: String,
    color: String,
    val seatsCount: Int
) : Furniture(material, color)

class SofaBed(
    material: String,
    color: String,
    seatsCount: Int,
    val isFoldable: Boolean
) : Sofa(material, color, seatsCount)

class CornerSofa(
    material: String,
    color: String,
    seatsCount: Int,
    val hasChaiseLounge: Boolean
) : Sofa(material, color, seatsCount)

//Абстрактный класс
abstract class Materials {
    protected val materials = mutableListOf<String>()

    abstract fun addMaterial(material: String)

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, material ->
            println("[$index]: $material")
        }
    }
}

class InsertFirstMaterial : Materials() {
    fun insert(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach {
            addMaterial(it)
        }
    }
}

class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials()
        for (i in items.indices) {
            addMaterial(items[i])
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
        for (i in items.size until materials.size) {
            addMaterial(materials[i])
        }
    }
}

class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}

class InsertMapMaterials : Materials() {

    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}