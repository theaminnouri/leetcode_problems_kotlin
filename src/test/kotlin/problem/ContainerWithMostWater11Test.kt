package problem

import com.theaminnouri.problem.ContainerWithMostWater11
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContainerWithMostWater11Test {

    @Test
    fun maxArea() {
        val ints = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        kotlin.test.assertEquals(49, ContainerWithMostWater11.maxArea(ints))
    }

    @Test
    fun optimumMaxArea() {
        val ints = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        assertEquals(49, ContainerWithMostWater11.optimumMaxArea(ints))
    }
}