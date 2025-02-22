package com.theaminnouri.problem

object MinimumWindowSubstring76 {

    fun minWindow(s: String, t: String): String {
        val patternMap = mutableMapOf<Char, Int>()
        val stringMap = mutableMapOf<Char, Int>()
        for (p in t) {
            patternMap[p] = (patternMap[p] ?: 0) + 1
        }
        var left = 0
        var startIndex = -1
        var minLength = Int.MAX_VALUE
        var count = 0
        for (right in 0..s.lastIndex) {
            val c = s[right]
            stringMap[c] = (stringMap[c] ?: 0) + 1
            if (patternMap.containsKey(c) && (stringMap[c] ?: 0) <= (patternMap[c] ?: 0)) {
                count++
            }
            if (count == t.length) {
                while (patternMap[s[left]] == null || stringMap[s[left]]!! > patternMap[s[left]]!!) {
                    val leftChar = s[left]
                    if (stringMap[leftChar]!! > (patternMap[leftChar] ?: 0)) {
                        stringMap[leftChar] = stringMap[leftChar]!! - 1
                    }
                    left++
                }
                val windowLength = right - left + 1
                if (minLength > windowLength) {
                    minLength = windowLength
                    startIndex = left
                }
            }
        }
        if (startIndex == -1) {
            return ""
        }
        return s.substring(startIndex = startIndex, endIndex = startIndex + minLength)
    }
}