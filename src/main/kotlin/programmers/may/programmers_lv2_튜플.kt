package programmers

import java.util.LinkedList
import java.util.Queue

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/64065
 */

fun main(args: Array<String>) {
    println(
        P64065.solution(
            "{{2},{2,1},{2,1,3},{2,1,3,4}}"
        )
    )
    println(
        P64065.solution(
            "{{1,2,3},{2,1},{1,2,4,3},{2}}"
        )
    )
    println(
        P64065.solution(
            "{{20,111},{111}}"
        )
    )
    println(
        P64065.solution(
            "{{123}}"
        )
    )
    println(
        P64065.solution(
            "{{4,2,3},{3},{2,3,4,1},{2,3}}"
        )
    )
}

private class P64065 {
    companion object {

        fun solution(s: String): IntArray {
            val answer = mutableSetOf<Int>()
            s.split("},{")
                .map {
                    it.replace(Regex("[{}]"),"")
                        .split(",").toList().map { str ->
                        str.toInt()
                    }
                }.sortedBy { it.size }
                .forEach{
                    answer.addAll(it)
                }
            return answer.toIntArray()
        }
    }
}
