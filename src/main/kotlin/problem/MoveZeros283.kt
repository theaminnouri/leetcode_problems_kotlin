package com.theaminnouri.problem

object MoveZeros283 {

    fun moveZeroes(nums: IntArray): Unit {
        var indexOfZero = 0
        for (num in nums) {
            if (num != 0) {
                nums[indexOfZero] = num
                indexOfZero++
            }
        }
        for (i in indexOfZero..nums.lastIndex)
            nums[i] = 0
    }

}
