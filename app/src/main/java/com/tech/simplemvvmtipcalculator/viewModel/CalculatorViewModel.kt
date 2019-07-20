package com.tech.simplemvvmtipcalculator.viewModel

import com.tech.simplemvvmtipcalculator.model.Tip
import com.tech.simplemvvmtipcalculator.model.TipCalculator

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