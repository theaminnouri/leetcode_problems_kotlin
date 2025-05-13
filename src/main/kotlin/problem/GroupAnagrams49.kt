package com.theaminnouri.problem

object GroupAnagrams49 {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, List<String>>()
        for (str in strs) {
            val key = str.toSortedSet().fold("") { acc, c -> acc + c }
            val list = map.getOrDefault(key, mutableListOf())
            map[key] = list.toMutableList().apply { add(str) }
        }
        return map.values.toList()
    }
}