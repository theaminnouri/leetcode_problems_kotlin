package problem

import com.theaminnouri.problem.MinimumWindowSubstring76
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumWindowSubstring76Test {

    @Test
    fun minWindow() {
        val find = MinimumWindowSubstring76.minWindow("ADOBECODEBANC", t = "ABC")
        assertEquals("BANC", find)
        val find1 = MinimumWindowSubstring76.minWindow("a", t = "aa")
        assertEquals("", find1)
    }
}