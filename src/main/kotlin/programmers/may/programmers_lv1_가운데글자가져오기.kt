package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */

fun main(args: Array<String>) {
    println(
        P12903.solution("abcde")
    )
    println(
        P12903.solution("qwer")
    )
}

private class P12903 {
    companion object {
        fun solution(s: String): String {
            return if (s.length % 2 != 0) {
                s.substring(s.length / 2, s.length / 2 + 1)
            } else {
                s.substring(s.length / 2 - 1, s.length / 2 + 1)
            }
        }
    }
}
