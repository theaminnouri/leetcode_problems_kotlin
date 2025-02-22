package problem

import com.theaminnouri.problem.ValidMountainArray941
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ValidMountainArray941Test {

    @Test
    fun validMountainArray() {
        val intArray = intArrayOf(0, 3, 2, 1)
        assertEquals(ValidMountainArray941.validMountainArray(intArray), true)
    }
}