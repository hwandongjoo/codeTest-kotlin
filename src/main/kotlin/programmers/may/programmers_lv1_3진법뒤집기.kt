package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */

fun main(args: Array<String>) {
    println(
        P68935.solution(
            45
        )
    )
    println(
        P68935.solution(
            125
        )
    )
}

private class P68935 {
    companion object {

        fun solution(n: Int): Int {
            return n.toString(3)
                .reversed()
                .toInt(3)
        }
    }
}
