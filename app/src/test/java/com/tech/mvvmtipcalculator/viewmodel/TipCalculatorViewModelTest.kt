package com.tech.mvvmtipcalculator.viewmodel

import com.tech.mvvmtipcalculator.model.TipCalculator
import com.tech.mvvmtipcalculator.viewModel.TipCalculatorViewModel
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class TipCalculatorViewModelTest {

    lateinit var tipCalculatorViewModel: TipCalculatorViewModel

    //In order to test individual units of our source code,
    // we need to isolate the class we want to test.
    // Any other interactions with other classes should be mocked.
    // Mocking allows us to fake these interactions.
    // In order to do that we will focus on Mockito.
    @Mock
    lateinit var mockCalculator: TipCalculator

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        tipCalculatorViewModel = TipCalculatorViewModel()
        tipCalculatorViewModel.inputCheckAmount = "10.00"
        tipCalculatorViewModel.inputTipPercentage = "25"
    }

    @Test
    fun testCalculateTip() {



        tipCalculatorViewModel.calculate()

       // assertEquals()
        assertEquals(10.00, tipCalculatorViewModel.tip.checkAmount)
        assertEquals(25, tipCalculatorViewModel.tip.tipPercentage)
        assertEquals(2.5, tipCalculatorViewModel.tip.tipAmount)
        assertEquals(12.5, tipCalculatorViewModel.tip.total)

    }
}