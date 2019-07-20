package com.tech.mvvmtipcalculator.viewmodel

import com.tech.mvvmtipcalculator.model.Tip
import com.tech.mvvmtipcalculator.model.TipCalculator

class TipCalculatorViewModel(val tipCalculator: TipCalculator = TipCalculator()) {

    lateinit var inputCheckAmount: String

    lateinit var inputTipPercentage: String

    var tip = Tip()

    fun calculate() {

        var check = inputCheckAmount.toDoubleOrNull()
        var percentage = inputTipPercentage.toIntOrNull()

        if (check != null && percentage != null) {
            tip = tipCalculator.calculateTip(check, percentage)
        }
    }
}