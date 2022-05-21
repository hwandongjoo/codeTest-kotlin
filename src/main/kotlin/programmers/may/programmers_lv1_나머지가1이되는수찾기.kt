package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/87389
 */

fun main(args: Array<String>) {
    println(
        P87389.solution(10)
    )
    println(
        P87389.solution(12)
    )
}

private class P87389 {
    companion object {
        fun solution(n: Int): Int {
            for (i in 2..n) {
                if (n % i == 1) {
                    return i
                }
            }
            return n - 1
        }
    }
}
