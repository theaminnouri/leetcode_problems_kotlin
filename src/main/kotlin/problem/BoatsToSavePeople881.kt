package com.theaminnouri.problem

object BoatsToSavePeople881 {

    fun numRescueBoats(people: IntArray, limit: Int, boatsPeoplesLimit: Int = 2): Int {
        val sortedPeople = people.sorted()
        if (sortedPeople.last() > limit) {
            return 0
        }
        var numberOfBoats = 0
        var l = 0
        var r = sortedPeople.lastIndex
        while (l <= r) {
            var sum = sortedPeople[r]
            var remainedSit = boatsPeoplesLimit - 1
            while (remainedSit > 0 && sum + sortedPeople[l] <= limit) {
                remainedSit--
                sum += sortedPeople[l]
                l++
            }
            r--
            numberOfBoats++
        }
        return numberOfBoats
    }

}