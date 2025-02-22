package com.theaminnouri.problem

object ValidMountainArray941 {

    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) {
            return false
        }
        val length = arr.size - 1
        var pivot = 0
        for (i in 0..<length) {
            if (i == pivot && arr[i] < arr[i + 1] && i + 1 < length) {
                pivot++
            } else if (pivot > 0 && arr[i] > arr[i + 1]) {
                continue
            } else {
                return false
            }
        }
        return true
    }


}