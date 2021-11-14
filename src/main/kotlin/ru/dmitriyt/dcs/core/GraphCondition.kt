package ru.dmitriyt.dcs.core

/**
 * Интерфейс задача поиска
 */
interface GraphCondition {
    /**
     * Удовлетворяет ли граф данному условию
     */
    fun check(graph6: String): Boolean
}