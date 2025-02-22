package problem

import com.theaminnouri.problem.AddBinary67
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddBinary67Test {

    @Test
    fun addBinary() {
        val result = AddBinary67.addBinary(a = "1010", b = "1011")
        assertEquals("10101", result)
    }
}