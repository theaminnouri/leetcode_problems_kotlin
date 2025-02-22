package problem

import com.theaminnouri.problem.TwoSum1
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSum1Test {

    @Test
    fun optimalTwoSum() {
    }

    @Test
    fun twoSum() {
        val result = TwoSum1.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertEquals(result.toList(), listOf(0, 1))
    }
}