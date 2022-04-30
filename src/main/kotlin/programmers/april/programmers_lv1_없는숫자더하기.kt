package programmers

/*
 * written by hjoo
 */


import java.io.*

/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/86051
 */

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    println(P86051.solution(intArrayOf(1, 2, 3, 4, 6, 7, 8, 0)))
    println(P86051.solution(intArrayOf(5, 8, 4, 0, 6, 7, 9)))
}

private class P86051 {
    companion object {
        fun solution(numbers: IntArray): Int {
            return SUM - numbers.sum()
        }

        // sum of 0~9
        const val SUM = 45
    }
}
