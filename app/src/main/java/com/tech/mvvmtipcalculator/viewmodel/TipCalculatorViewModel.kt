package com.tech.mvvmtipcalculator.viewmodel

import android.databinding.BaseObservable
import com.tech.mvvmtipcalculator.model.Tip
import com.tech.mvvmtipcalculator.model.TipCalculator

class TipCalculatorViewModel(val tipCalculator: TipCalculator = TipCalculator()) : BaseObservable() {

    var inputCheckAmount = ""

    var inputTipPercentage = ""

    var outputCheckAmount = ""

    var outputTipAmount = ""

    var outputTotalDollarAmount = ""

    var tip = Tip()

    fun calculate() {

        var check = inputCheckAmount.toDoubleOrNull()
        var percentage = inputTipPercentage.toIntOrNull()

        if (check != null && percentage != null) {
            tip = tipCalculator.calculateTip(check, percentage)
        }

        outputCheckAmount = "$" + tip.checkAmount.toString()
        outputTipAmount = "$" + tip.tipAmount.toString()
        outputTotalDollarAmount = "$" + tip.total.toString()
        notifyChange()
    }
}