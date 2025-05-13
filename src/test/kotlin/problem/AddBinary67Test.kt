package problem

import com.theaminnouri.problem.AddBinary67
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AddBinary67Test {

    @Test
    fun addBinary() {
        val result = AddBinary67.addBinary(a = "1010", b = "1011")
        assertEquals("10101", result)
        val result2 = AddBinary67.addBinary(a = "11", b = "1")
        assertEquals("100", result2)
        val result3 = AddBinary67.addBinary(a = "111", b = "1")
        assertEquals("1000", result3)
    }

    @Test
    fun addBinary2() {
        val result = AddBinary67.addBinary2(a = "1010", b = "1011")
        assertEquals("10101", result)
        val result2 = AddBinary67.addBinary2(a = "11", b = "1")
        assertEquals("100", result2)
        val result3 = AddBinary67.addBinary2(a = "111", b = "1")
        assertEquals("1000", result3)
    }
}