package com.tech.mvvmtipcalculator.model

import java.math.RoundingMode

class TipCalculator {

    fun calculateTip(checkInput: Double, tipPct: Int): Tip {

        // var tipAmount = tipPct * checkInput / 100

        val tipAmount = (checkInput * (tipPct.toDouble() / 100.0))
            .toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP)
            .toDouble()

        return Tip(
            checkInput, tipPct, tipAmount, checkInput
                    + tipAmount
        )
    }

}