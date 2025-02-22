package problem

import com.theaminnouri.problem.MoveZeros283
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MoveZeros283Test {

    @Test
    fun moveZeroes() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        MoveZeros283.moveZeroes(nums)
        assertEquals(nums.toList(), listOf(1, 3, 12, 0, 0))
    }
}