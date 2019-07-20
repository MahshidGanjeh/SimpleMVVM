package com.tech.mvvmtipcalculator.viewModel

import com.tech.mvvmtipcalculator.model.Tip
import com.tech.mvvmtipcalculator.model.TipCalculator

class CalculatorViewModel(val calculator: TipCalculator = TipCalculator()) {

    var inputCheckAmount = ""

    var inputTipPercentage = ""

    var tip = Tip()

    fun calculate() {

        var check = inputCheckAmount.toDoubleOrNull()
        var percentage = inputTipPercentage.toIntOrNull()

        if (check != null && percentage != null) {
            calculator.calculateTip(check, percentage)
        }
    }
}