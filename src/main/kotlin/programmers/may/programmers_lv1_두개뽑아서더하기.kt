package programmers

import java.util.*

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */

fun main(args: Array<String>) {
    println(
        P68644.solution(intArrayOf(2, 1, 3, 4, 1)).toList()
    )
    println(
        P68644.solution(intArrayOf(5, 0, 2, 7)).toList()
    )
}

private class P68644 {
    companion object {
        fun solution(numbers: IntArray): IntArray {
            val sums = TreeSet<Int>()
            numbers.forEachIndexed { index: Int, number: Int ->
                for (i in numbers.slice(index + 1 until numbers.size)) {
                    sums.add(number + i)
                }
            }
            return sums.toIntArray()
        }
    }
}
