package ru.dmitriyt.dcs.core

/**
 * Интерфейс, содержащий вычисление инварианта графа
 */
interface GraphInvariant {
    /**
     * Версия алгоритма
     */
    val version: Int

    /**
     * Вычислить инвариант графа
     */
    fun solve(graph6: String): Int
}