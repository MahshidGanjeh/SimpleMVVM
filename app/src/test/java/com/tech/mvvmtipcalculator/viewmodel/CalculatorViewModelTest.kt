package com.tech.mvvmtipcalculator.viewmodel

import com.tech.mvvmtipcalculator.viewModel.CalculatorViewModel
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculatorViewModelTest {

    lateinit var calculatorViewModel: CalculatorViewModel


    @Before
    fun setUp() {
        calculatorViewModel = CalculatorViewModel()
    }

    @Test
    fun testCalculateTip() {
        calculatorViewModel.inputCheckAmount = "10.0"
        calculatorViewModel.inputTipPercentage = "25"

        calculatorViewModel.calculate()

        assertEquals(10.0, calculatorViewModel.tip.checkAmount)
        assertEquals(25, calculatorViewModel.tip.tipPercentage)
        assertEquals(2.5, calculatorViewModel.tip.tipAmount)
        assertEquals(12.5, calculatorViewModel.tip.total)


    }
}