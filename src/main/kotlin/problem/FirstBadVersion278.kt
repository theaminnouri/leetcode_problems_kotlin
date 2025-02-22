package com.theaminnouri.problem

object FirstBadVersion278 {


     fun optimalFirstBadVersion(n: Int): Int {
        var firstBadVersions = -1
        var lefIndex = 1
        var rightIndex = n
        while (lefIndex <= rightIndex) {
            val mid = ((rightIndex - lefIndex) / 2) + lefIndex
            if (isBadVersion(mid)) {
                rightIndex = mid
                if (lefIndex == rightIndex) {
                    firstBadVersions = lefIndex
                    break
                }
            } else {
                lefIndex = mid + 1
            }
        }
        return firstBadVersions
    }

    private fun firstBadVersion(n: Int): Int {
        var firstBadVersions = -1
        var lefIndex = 1
        var rightIndex = n
        while (lefIndex <= rightIndex) {
            val mid = ((rightIndex - lefIndex) / 2) + lefIndex
            if (isBadVersion(mid)) {
                if (isBadVersion(mid - 1)) {
                    rightIndex = mid - 1
                } else {
                    firstBadVersions = mid
                    break
                }
            } else {
                if (isBadVersion(mid + 1)) {
                    firstBadVersions = mid + 1
                    break
                } else {
                    lefIndex = mid + 1
                }
            }
        }
        return firstBadVersions
    }

    private fun isBadVersion(version: Int): Boolean {
        return version == 5
    }
}