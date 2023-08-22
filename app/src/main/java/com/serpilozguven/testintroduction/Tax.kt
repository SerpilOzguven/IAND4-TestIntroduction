package com.serpilozguven.testintroduction



import org.junit.Test


class Tax{

    //Test Driven Development
    //Test-Development-Test-Development-Test

    fun calculateTax(grossIncome: Double, taxRate: Double): Double {
        return grossIncome * taxRate
    }

    fun calculateNetIncome(grossIncome: Double, taxRate: Double): Double {
        return grossIncome - (grossIncome * taxRate)
    }
}
