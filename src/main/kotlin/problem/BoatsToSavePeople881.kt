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

    fun numRescueBoats2(people: IntArray, limit: Int): Int {
        var numberOfBoats = 0
        val sortedWeight = people.sorted()
        var i = 0
        var j = sortedWeight.lastIndex
        while (i <= j) {
            if (sortedWeight[i] + sortedWeight[j] <= limit) {
                i++
                j--
            } else {
                j--
            }
            numberOfBoats++
            if (i !in sortedWeight.indices)
                break
        }
        return numberOfBoats
    }

}