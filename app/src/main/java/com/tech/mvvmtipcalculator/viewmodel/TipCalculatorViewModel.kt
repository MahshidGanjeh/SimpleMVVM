package com.tech.mvvmtipcalculator.viewmodel

import android.databinding.BaseObservable
import com.tech.mvvmtipcalculator.model.Tip
import com.tech.mvvmtipcalculator.model.TipCalculator

class TipCalculatorViewModel(val tipCalculator: TipCalculator = TipCalculator()) : BaseObservable() {

    var inputCheckAmount = ""

    var inputTipPercentage = ""

    var tip = Tip()

    fun calculate() {

        var check = inputCheckAmount.toDoubleOrNull()
        var percentage = inputTipPercentage.toIntOrNull()

        if (check != null && percentage != null) {
            tip = tipCalculator.calculateTip(check, percentage)
        }

        inputCheckAmount = "00"
        notifyChange()
    }
}