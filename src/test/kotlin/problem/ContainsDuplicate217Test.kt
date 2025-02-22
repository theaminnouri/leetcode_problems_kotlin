package problem

import com.theaminnouri.problem.ContainsDuplicate217
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ContainsDuplicate217Test {

    @Test
    fun containsDuplicate() {
        val hasDuplicate = ContainsDuplicate217.containsDuplicate(intArrayOf(1, 2, 3, 1))

        assertEquals(true, hasDuplicate)
    }
}