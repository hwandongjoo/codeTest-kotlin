package programmers

import java.util.LinkedList
import java.util.Queue

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */

fun main(args: Array<String>) {
    println(
        P42746.solution(
            intArrayOf(6, 10, 2)
        )
    )
    println(
        P42746.solution(
            intArrayOf(3, 30, 34, 5, 9)
        )
    )
    println(
        P42746.solution(
            intArrayOf(0,0,0,0,0)
        )
    )
}

private class P42746 {
    companion object {

        fun solution(numbers: IntArray): String {
            return numbers.asSequence()
                .map {
                    it.toString()
                }.sortedWith { o1, o2 ->
                    when (o1.length) {
                        o2.length -> o2.compareTo(o1)
                        else -> (o2 + o1).compareTo(o1 + o2)
                    }
                }.joinToString("")
                .let {
                    when(it[0]){
                        '0' -> "0"
                        else -> it
                    }
                }
        }
    }
}
