package programmers

import java.util.LinkedList
import java.util.Queue

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/72411
 */

fun main(args: Array<String>) {
    println(
        P72411.solution(
            arrayOf("ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"), intArrayOf(2, 3, 4)
        ).toList()

    )
    println(
        P72411.solution(
            arrayOf("ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"), intArrayOf(2, 3, 5)
        ).toList()

    )
    println(
        P72411.solution(
            arrayOf("XYZ", "XWY", "WXA"), intArrayOf(2, 3, 4)
        ).toList()
    )
}

private class P72411 {
    companion object {

        val countMap = hashMapOf<String, Int>()

        fun solution(orders: Array<String>, course: IntArray): Array<String> {
            var answer: Array<String> = arrayOf()
            val sortedOrders = orders.map {
                it.toCharArray().sorted().joinToString("")
            }
            for (n in course) {
                for (order in sortedOrders) {
                    countCombination(0, n, order, "")
                }
            }
            for (n in course) {
                var max = Int.MIN_VALUE
                countMap.entries.sortedByDescending { it.value }.forEach {
                    if (it.key.length == n) {
                        if (max > it.value || it.value < 2) {
                            return@forEach
                        }
                        max = maxOf(max, it.value)
                        answer = answer.plus(it.key)
                    }
                }
            }
            answer.sortWith { o1, o2 -> o1.compareTo(o2) }
            return answer
        }

        fun countCombination(index: Int, targetLength: Int, order: String, combination: String) {
            if (combination.length == targetLength) {
                countMap.merge(combination, 1, Int::plus)
                return
            }
            if (index >= order.length) return
            countCombination(index + 1, targetLength, order, combination + order[index])
            countCombination(index + 1, targetLength, order, combination)
        }

    }
}
