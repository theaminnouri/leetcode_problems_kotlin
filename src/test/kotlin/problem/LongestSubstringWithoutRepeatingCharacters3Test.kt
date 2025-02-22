package problem

import com.theaminnouri.problem.LongestSubstringWithoutRepeatingCharacters3
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharacters3Test {

    @Test
    fun optimalLengthOfLongestSubstring() {
        kotlin.test.assertEquals(
            LongestSubstringWithoutRepeatingCharacters3.optimalLengthOfLongestSubstring("abcabcbb"),
            3
        )
    }

    @Test
    fun lengthOfLongestSubstring() {
        kotlin.test.assertEquals(LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("abcabcbb"), 3)
    }
}