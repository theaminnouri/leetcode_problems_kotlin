package com.theaminnouri.problem

object AddBinary67 {

    fun addBinary(a: String, b: String): String {
        var newA = a
        var newB = b
        val lengthOfA = a.length
        val lengthOfB = b.length
        if (lengthOfB > lengthOfA) {
            for (i in 0 until lengthOfB - lengthOfA)
                newA = "0$newA"
        } else if (lengthOfA > lengthOfB) {
            for (i in 0 until lengthOfA - lengthOfB)
                newB = "0$newB"
        }
        var carry = 0
        var result = ""
        for (i in newA.lastIndex downTo 0) {
            var sum = carry
            sum += newB[i].digitToInt() + newA[i].digitToInt()
            carry = sum / 2
            result = "${sum % 2}$result"
        }
        if (carry > 0) {
            result = "$carry$result"
        }
        return result
    }

    fun addBinary2(a: String, b: String): String {
        var newA = a
        var newB = b
        val lengthOfB = b.length
        val lengthOfA = a.length
        if (lengthOfA > lengthOfB) {
            repeat(lengthOfA - lengthOfB) {
                newB = "0$newB"
            }
        } else if (lengthOfB > lengthOfA) {
            repeat(times = lengthOfB - lengthOfA) {
                newA = "0$newA"
            }
        }
        var result = ""
        var carry = 0
        for (i in newA.lastIndex downTo 0) {
            var sum = carry
            sum += newA[i].digitToInt() + newB[i].digitToInt()
            result = "${sum % 2}" + result
            carry = sum / 2
        }
        if (carry > 0)
            result = carry.toString() + result
        return result
    }

}
