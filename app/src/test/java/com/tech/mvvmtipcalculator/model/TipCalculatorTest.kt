package com.tech.mvvmtipcalculator.model

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RestaurantCalculatorTest {

    lateinit var calculator: TipCalculator

    @Before
    fun setUp() {
        calculator = TipCalculator()
    }

    @Test
    fun testCalculateTip() {

        var checkInput: Double = 10.0
        var tipPct = 25

        var expectedTipResult = Tip(
            checkAmount = checkInput,
            tipPercentage = tipPct,
            tipAmount = 2.50,
            total = 12.50
        )

        assertEquals(
            expectedTipResult,
            calculator.calculateTip(checkInput, tipPct)
        )
    }


}