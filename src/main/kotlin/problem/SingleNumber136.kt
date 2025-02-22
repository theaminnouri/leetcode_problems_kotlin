package com.theaminnouri.problem

object SingleNumber136 {

    fun secondOptimalSingleNumber(nums: IntArray): Int {
        var result = 0
        for (i in nums) {
            result = result xor i
        }
        return result
    }

    fun optimalSingleNumber(nums: IntArray): Int {
        val expectedSum = nums.toSet().sum() * 2
        val singleNumber = expectedSum - nums.sum()
        return singleNumber
    }

    fun singleNumber(nums: IntArray): Int {
        val sortedNumbs = nums.sorted()
        var previousNum = sortedNumbs.first()
        var numCount = 1
        for (i in 1..sortedNumbs.lastIndex) {
            if (previousNum == sortedNumbs[i]) {
                numCount++
            } else {
                if (numCount < 2) {
                    return previousNum
                } else {
                    numCount = 1
                    previousNum = sortedNumbs[i]
                }
            }
        }
        return previousNum
    }
}
