package problem

import com.theaminnouri.problem.GroupAnagrams49
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GroupAnagrams49Test {

    @Test
    fun groupAnagrams() {
        val outPut = GroupAnagrams49.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        val expected = listOf(listOf("ate", "eat", "tea"), listOf("nat", "tan"), listOf("bat"))
        assertEquals(expected, outPut)
    }

}
