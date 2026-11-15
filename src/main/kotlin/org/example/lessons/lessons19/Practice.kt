package org.example.lessons.lessons19

class Container<T>(private val item: T) {
    fun getItem(): T = item
}

class PairBox<K, V>(
    private val key: K,
    private val value: V
) {
    fun getMap(): Map<K, V> = mapOf(key to value)
}

class Multiplier<T: Number> {
    fun multiply(value: T): Double {
        return value.toDouble() * 2
    }
}

class NullableBox<T> {
    fun nullableBox(value: T?): Boolean = value == null
}

interface Storagy<T> {
    fun save(value: T)
    fun get(): T
}

interface Transformer<T, R> {
    fun transform(value: T): R
}