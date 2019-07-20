package com.tech.mvvmtipcalculator.model

class TipCalculator {

    fun calculateTip(checkInput: Double, tipPct: Int): Tip {

        var tipAmount = tipPct * checkInput / 100
        return Tip(
            checkInput, tipPct, tipAmount, checkInput
                    + tipAmount
        )
    }

}