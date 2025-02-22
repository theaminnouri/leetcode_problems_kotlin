package com.theaminnouri.problem

import kotlin.math.min

object ContainerWithMostWater11 {

    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        val lastIndex = height.lastIndex
        for (i in 0..lastIndex) {
            for (j in lastIndex downTo 0) {
                val currentArea = min(height[i], height[j]) * (j - i)
                if (currentArea > maxArea) {
                    maxArea = currentArea
                }
            }
        }
        return maxArea
    }

    fun optimumMaxArea(height: IntArray): Int {
        var maxArea = 0
        var l = 0
        var r = height.size - 1

        while (r > l) {
            val lH = height[l]
            val rH = height[r]
            val currentArea = min(lH, rH) * (r - l)
            if (currentArea > maxArea)
                maxArea = currentArea
            if (lH > rH) {
                r--
            } else {
                l++
            }
        }
        return maxArea
    }
}