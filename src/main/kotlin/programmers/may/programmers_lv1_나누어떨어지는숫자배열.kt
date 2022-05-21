package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */

fun main(args: Array<String>) {
    println(
        P12910.solution(intArrayOf(5, 9, 7, 10), 5).toList()
    )
    println(
        P12910.solution(intArrayOf(2, 36, 1, 3), 1).toList()
    )
    println(
        P12910.solution(intArrayOf(3, 2, 6), 10).toList()
    )
}

private class P12910 {
    companion object {
        fun solution(arr: IntArray, divisor: Int): IntArray {
            return arr.asSequence().filter { it % divisor == 0 }.toList()
                .ifEmpty {
                    listOf(-1)
                }.sorted().toIntArray()
        }
    }
}
