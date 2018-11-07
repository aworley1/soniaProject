package com.sonia

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

//---------------------This is the TEST code - not the REAL code ----------------------------------
class TemperatureTest() {
    @Test
    fun `temperature should not equal a string`() {
        val twentyOneC = Temperature(21.0, "C")

        assertThat(twentyOneC.equals("a duck quacks"), equalTo(false))
    }

    @Test
    fun `should not be equal if values are different`() {
        val twentyOneC = Temperature(21.0, "C")
        val twentyEightPointFiveC = Temperature(28.5, "C")

        //21 degrees should not equal 28.5 degress
        assertThat(twentyOneC.equals(twentyEightPointFiveC), equalTo(false))
    }

    @Test
    fun `should be equal if values are the same`() {
        val twentyOneC = Temperature(21.0, "C")
        val twentyOneCAgain = Temperature(21.0, "C")

        //21 Degrees should equal 21 Degrees
        assertThat(twentyOneC.equals(twentyOneCAgain), equalTo(true))
    }

    @Test
    fun `should not be equal if units are different`() {
        val twentyOneC = Temperature(21.0, "C")
        val twentyOneF = Temperature(21.0, "F")

        assertThat(twentyOneC.equals(twentyOneF), equalTo(false))
    }

    @Test
    fun `should double the temperature`() {
        val twentyOneC = Temperature(21.0, "C")
        val fourtyTwoC = Temperature(42.0, "C")

        assertThat(twentyOneC.doubleTheTemperature(), equalTo(fourtyTwoC))
    }
}


//---------------------This is the REAL code - not the TEST code ----------------------------------
class Temperature(private val number: Double, private val unit: String) {
    override fun equals(other: Any?): Boolean {
        return other is Temperature && this.number == other.number && this.unit == other.unit
    }

    fun doubleTheTemperature(): Temperature {
        return Temperature(this.number * 2, this.unit)
    }
}
