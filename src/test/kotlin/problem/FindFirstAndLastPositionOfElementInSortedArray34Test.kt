package problem

import com.theaminnouri.problem.FindFirstAndLastPositionOfElementInSortedArray34
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindFirstAndLastPositionOfElementInSortedArray34Test {

    @Test
    fun searchRange() {
        assertEquals(
            intArrayOf(1, 4).toList(),
            FindFirstAndLastPositionOfElementInSortedArray34.searchRange(intArrayOf(5, 6, 6, 6, 6, 8, 10, 10), 6)
                .toList()
        )
    }
}