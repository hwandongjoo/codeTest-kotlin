package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/70128
 */

fun main(args: Array<String>) {
    println(
        P70128.solution(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(-3, -1, 0, 2),
        )
    )
    println(
        P70128.solution(
            intArrayOf(-1, 0, 1),
            intArrayOf(1, 0, -1),

            )
    )
}

private class P70128 {
    companion object {

        fun solution(a: IntArray, b: IntArray): Int {
            var answer: Int = 0
            a.forEachIndexed { index, i ->
                answer += i*b[index]
            }
            return answer
        }
    }
}
