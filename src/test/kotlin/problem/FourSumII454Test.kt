package problem

import com.theaminnouri.problem.FourSumII454
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FourSumII454Test {

    @Test
    fun fourSumCount() {
        val answer = FourSumII454.fourSumCount(
            nums1 = intArrayOf(1, 2),
            nums2 = intArrayOf(-2, -1),
            nums3 = intArrayOf(-1, 2),
            nums4 = intArrayOf(0, 2),
        )
    }

    @Test
    fun optimizedFourSumCount() {
        val optimizedAnswer = FourSumII454.optimizedFourSumCount(
            nums1 = intArrayOf(1, 2),
            nums2 = intArrayOf(-2, -1),
            nums3 = intArrayOf(-1, 2),
            nums4 = intArrayOf(0, 2),
        )
        assertEquals(optimizedAnswer, 2)
    }
}