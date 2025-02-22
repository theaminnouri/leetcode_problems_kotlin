package com.theaminnouri.problem

object RobotReturnToOrigin657 {

    fun judgeCircle(moves: String): Boolean {
        var x = 0
        var y = 0
        for (i in moves) {
            when (i) {
                'U' -> {
                    y++
                }

                'D' -> {
                    y--
                }

                'R' -> {
                    x++
                }

                'L' -> {
                    x--
                }
            }
        }
        return y == 0 && x == 0
    }
}
