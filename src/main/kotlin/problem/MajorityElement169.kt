package com.theaminnouri.problem

object MajorityElement169 {

    fun majorityElement(nums: IntArray): Int {
        val n = nums.size
        val map = hashMapOf<Int, Int>()
        for (i in nums) {
            val currentCount = map[i] ?: 0
            if (currentCount + 1 > n / 2) {
                return i
            }
            map[i] = currentCount + 1
        }
        return 0
    }

    fun boyer_moore_majorityElement(nums: IntArray): Int {
        var candidate = nums[0]
        var count = 0
        for (i in nums) {
            if (count == 0) {
                candidate = i
            }
            if (i == candidate)
                count++
            else
                count--
        }
        return candidate
    }

}
