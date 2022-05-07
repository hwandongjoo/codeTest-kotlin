package programmers

import java.util.LinkedList
import java.util.Queue

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 */

fun main(args: Array<String>) {
    println(
        P43165.solution(
            intArrayOf(1, 1, 1, 1, 1), 3
        )
    )
    println(
        P43165.solution(
            intArrayOf(4, 1, 2, 1), 4
        )
    )
}

private class P43165 {
    companion object {

        fun solution(numbers: IntArray, target: Int): Int {
            var answer = 0
            val queue: Queue<Int> = LinkedList()
            queue.add(numbers.first())
            queue.add(-numbers.first())
            var index = 1
            while (queue.isNotEmpty()) {
                val size = queue.size
                if (index >= numbers.size) {
                    break
                }
                for (s in 0 until size) {
                    val now = queue.poll()
                    queue.add(now + numbers[index])
                    queue.add(now - numbers[index])
                }
                index++
            }
            answer = queue.count { it == target }
            return answer
        }
    }
}
