package com.theaminnouri.problem

object ContainsDuplicate217 {

    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Boolean>()
        for (i in nums) {
            if (map[i] == true) {
                return true
            } else {
                map[i] = true
            }
        }
        return false
    }

}
