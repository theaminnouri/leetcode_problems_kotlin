package problem

import com.theaminnouri.problem.MinimumWindowSubstring76
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MinimumWindowSubstring76Test {

    @Test
    fun minWindow() {
        val find = MinimumWindowSubstring76.minWindow("ADOBECODEBANC", t = "ABC")
        assertEquals( "BANC",find)
    }
}