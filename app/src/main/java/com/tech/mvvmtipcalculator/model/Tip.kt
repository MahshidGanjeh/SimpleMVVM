package com.tech.mvvmtipcalculator.model

data class Tip(
    val checkAmount: Double = 0.0,
    val tipPercentage: Int = 0,
    val tipAmount: Double = 0.0,
    val total: Double = 0.0

)