package problem

import com.theaminnouri.problem.CountPrimes204
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountPrimes204Test {

    @Test
    fun countPrime() {
        assertEquals(4, CountPrimes204.countPrimes(10))
    }
}