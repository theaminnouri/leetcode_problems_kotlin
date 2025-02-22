package problem

import com.theaminnouri.problem.SingleNumber136
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingleNumber136Test {

    @Test
    fun secondOptimalSingleNumber() {
        val singleNumber4 = SingleNumber136.secondOptimalSingleNumber(nums = intArrayOf(4, 1, 2, 1, 2))
        assertEquals(singleNumber4, 4)
        val singleNumber5 = SingleNumber136.secondOptimalSingleNumber(nums = intArrayOf(2, 2, 1))
        assertEquals(singleNumber5, 1)
    }

    @Test
    fun optimalSingleNumber() {
        val singleNumber2 = SingleNumber136.optimalSingleNumber(nums = intArrayOf(4, 1, 2, 1, 2))
        assertEquals(singleNumber2, 4)
        val singleNumber3 = SingleNumber136.optimalSingleNumber(nums = intArrayOf(2, 2, 1))
        assertEquals(singleNumber3, 1)
    }

    @Test
    fun singleNumber() {
        val singleNumber = SingleNumber136.singleNumber(nums = intArrayOf(4, 1, 2, 1, 2))
        assertEquals(singleNumber, 4)
        val singleNumber1 = SingleNumber136.singleNumber(nums = intArrayOf(2, 2, 1))
        assertEquals(singleNumber1, 1)
    }
}