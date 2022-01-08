package ru.dmitriyt.dcs.core

/**
 * Интерфейс задача поиска
 */
interface GraphCondition {
    /**
     * Версия алгоритма
     */
    val version: Int

    /**
     * Удовлетворяет ли граф данному условию
     */
    fun check(graph6: String): Boolean
}