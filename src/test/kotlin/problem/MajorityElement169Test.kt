package problem

import com.theaminnouri.problem.MajorityElement169
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElement169Test {

    @Test
    fun majorityElement() {
        val majorityElement = MajorityElement169.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))
        assertEquals(majorityElement, 2)
    }

    @Test
    fun boyer_moore_majorityElement() {
        val boyer_moore_majorityElement =
            MajorityElement169.boyer_moore_majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))
        assertEquals(boyer_moore_majorityElement, 2)
    }
}