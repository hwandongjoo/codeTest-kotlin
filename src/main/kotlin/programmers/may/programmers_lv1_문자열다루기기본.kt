package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 */

fun main(args: Array<String>) {
    println(
        P12918.solution(
            "a234"
        )
    )
}

private class P12918 {
    companion object {
        fun solution(s: String): Boolean {
            return (s.length == 4 || s.length == 6) && s.all { it.isDigit() }
        }
    }
}
