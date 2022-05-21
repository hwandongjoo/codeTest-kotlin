package programmers

import java.time.*

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */

fun main(args: Array<String>) {
    println(
        P12901.solution(5, 24)
    )
}

private class P12901 {
    companion object {
        fun solution(a: Int, b: Int): String {
            return LocalDate.of(2016, a, b).dayOfWeek.name.substring(0..2)
        }
    }
}
