package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 */

fun main(args: Array<String>) {
    println(
        P12917.solution(
            "ZbcdefgA"
        )
    )
}

private class P12917 {
    companion object {
        fun solution(s: String): String {
            return s.toList().sortedWith { o1, o2 ->
                o2.compareTo(o1)
            }.joinToString("")
        }
    }
}
