package com.example.pitestandroidtestproject

class Calculator {
    fun calc(a: Int, b: Int, isPlus: Boolean): Int {
        return if(isPlus) {
            a + b
        } else {
            a-b
        }
    }
}