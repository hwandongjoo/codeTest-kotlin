package programmers

import kotlin.math.*

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */

fun main(args: Array<String>) {
    println(
        P12912.solution(
            3, 5
        )
    )
    println(
        P12912.solution(
            3, 3
        )
    )
    println(
        P12912.solution(
            5, 3
        )
    )
}

private class P12912 {
    companion object {
        fun solution(a: Int, b: Int): Long {
            var (min, max) = min(a, b).toLong() to max(a, b).toLong()
            return (min..max).sum()
        }
    }
}
