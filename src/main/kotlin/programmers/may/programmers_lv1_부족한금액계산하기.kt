package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 */

fun main(args: Array<String>) {
    println(
        P82612.solution(3, 20, 4)
    )
}

private class P82612 {
    companion object {
        fun solution(price: Int, money: Int, count: Int): Long {
            val answer = (price.toLong() * (count) * (count + 1) / 2L - money)
            return if (answer > 0) {
                answer
            } else {
                0
            }
        }
    }
}
