package com.example.kotlin

import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    fun `Test plus is sum of inpputs`() {
        val result = Calculator().calc(1, 2, isPlus = true)
        assert(result == 3)
    }

    @Test
    fun `Test minus is difference of inpputs`() {
        val result = Calculator().calc(1, 2, isPlus = false)
        assert(result == -1)
    }
}