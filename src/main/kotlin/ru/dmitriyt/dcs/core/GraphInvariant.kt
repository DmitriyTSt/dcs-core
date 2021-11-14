package ru.dmitriyt.dcs.core

/**
 * Интерфейс, содержащий вычисление инварианта графа
 */
interface GraphInvariant {
    /**
     * Вычислить инвариант графа
     */
    fun solve(graph6: String): Int
}