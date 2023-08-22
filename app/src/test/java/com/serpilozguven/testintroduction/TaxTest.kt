package com.serpilozguven.testintroduction

import org.junit.Assert.*

import org.junit.Test

class TaxTest {

    @Test
    fun calculateTax() {
        val tax = Tax()
        tax.calculateTax(100.0,0.1)
    }

    @Test
    fun calculateIncome() {
    }
}