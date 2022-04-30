package programmers

/*
 * written by hjoo
 */


import java.io.*

/**
 * 문제 링크
 * hhttps://programmers.co.kr/learn/courses/30/lessons/62048
 */

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    println(P62048.solution(8, 12))
    println(P62048.solution(2, 7))
}

private class P62048 {
    companion object {

        fun solution(w: Int, h: Int): Long {
            var answer = 0L
            val big = maxOf(w, h).toLong()
            val small = minOf(w, h).toLong()

            answer = big * small - (big + small - gcd(big, small))
            return answer
        }

        private fun gcd(a: Long, b: Long): Long {
            return if (b == 0L) {
                a
            } else {
                gcd(b, a % b)
            }
        }
    }
}
