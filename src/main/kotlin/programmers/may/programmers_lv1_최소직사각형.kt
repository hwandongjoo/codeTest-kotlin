package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/86491
 */

fun main(args: Array<String>) {
    println(
        P86491.solution(
            arrayOf(
                intArrayOf(60, 50), intArrayOf(30, 70),
                intArrayOf(60, 30), intArrayOf(80, 40),
            )
        )
    )
    println(
        P86491.solution(
            arrayOf(
                intArrayOf(10, 7), intArrayOf(12, 3), intArrayOf(8, 15), intArrayOf(14, 7), intArrayOf(5, 15)
            )
        )
    )
    println(
        P86491.solution(
            arrayOf(
                intArrayOf(14, 4), intArrayOf(19, 6), intArrayOf(6, 16), intArrayOf(18, 7), intArrayOf(7, 11)
            )
        )
    )
}

private class P86491 {
    companion object {
        fun solution(sizes: Array<IntArray>): Int {
            var w = 0
            var h = 0
            sizes.map { it.sorted() }.forEach {
                w = maxOf(w, it.first())
                h = maxOf(h, it.last())
            }
            return w * h
        }
    }
}
