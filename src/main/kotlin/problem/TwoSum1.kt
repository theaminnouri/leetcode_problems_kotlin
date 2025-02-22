package com.theaminnouri.problem

object TwoSum1 {

    // implement optimal one
    fun optimalTwoSum(nums: IntArray, target: Int): IntArray {
        return intArrayOf()
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..nums.lastIndex) {
            for (j in i..nums.lastIndex) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}
