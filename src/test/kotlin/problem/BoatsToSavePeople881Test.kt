package problem

import com.theaminnouri.problem.BoatsToSavePeople881
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoatsToSavePeople881Test {

    @Test
    fun numRescueBoats() {

        val numRescueBoats1 = BoatsToSavePeople881.numRescueBoats(people = intArrayOf(1, 2), limit = 3)
        assertEquals(1, numRescueBoats1)

        val numRescueBoats2 = BoatsToSavePeople881.numRescueBoats(people = intArrayOf(3, 3, 4, 5), limit = 5)
        assertEquals(4, numRescueBoats2)

        val numRescueBoats3 = BoatsToSavePeople881.numRescueBoats(
            people = intArrayOf(2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10), limit = 50
        )
        assertEquals(11, numRescueBoats3)

        val numRescueBoats4 = BoatsToSavePeople881.numRescueBoats(people = intArrayOf(3, 2, 2, 1), limit = 3)
        assertEquals(3, numRescueBoats4)

    }
}