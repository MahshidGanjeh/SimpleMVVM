package com.tech.mvvmtipcalculator.viewmodel

import com.tech.mvvmtipcalculator.model.Tip
import com.tech.mvvmtipcalculator.model.TipCalculator
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
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

        tipCalculatorViewModel = TipCalculatorViewModel(mockCalculator)

    }

    @Test
    fun testCalculateTip() {

        tipCalculatorViewModel.inputCheckAmount = "10.00"
        tipCalculatorViewModel.inputTipPercentage = "25"


        val stub = Tip(checkAmount = 10.00, tipAmount = 2.5, total = 12.5)

        `when`(mockCalculator.calculateTip(10.00, 25)).thenReturn(stub)

        tipCalculatorViewModel.calculate()

        //assertEquals(stub, tipCalculatorViewModel.tip)

        assertEquals("$10.0",tipCalculatorViewModel.outputCheckAmount)
        assertEquals("$2.5",tipCalculatorViewModel.outputTipAmount)
        assertEquals("$12.5" , tipCalculatorViewModel.outputTotalDollarAmount)
       /* assertEquals(10.00, tipCalculatorViewModel.tip.checkAmount)
        assertEquals(25, tipCalculatorViewModel.tip.tipPercentage)
        assertEquals(2.5, tipCalculatorViewModel.tip.tipAmount)
        assertEquals(12.5, tipCalculatorViewModel.tip.total)*/

    }
}