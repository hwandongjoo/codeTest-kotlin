package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 */

fun main(args: Array<String>) {
    println(
        P42862.solution(
            5, intArrayOf(2, 4), intArrayOf(1, 3, 5)
        )
    )
    println(
        P42862.solution(
            5, intArrayOf(2, 4), intArrayOf(3)
        )
    )
    println(
        P42862.solution(
            3, intArrayOf(3), intArrayOf(1)
        )
    )
    println(
        P42862.solution(
            5, intArrayOf(1, 3, 4, 5), intArrayOf(3, 5, 6)
        )
    )
}

private class P42862 {
    companion object {

        fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
            val losts = lost.sorted().toMutableList()
            val have = reserve.sorted().toMutableList()

            reserve.filter { it in losts }
                .forEach {
                    have.remove(it)
                    losts.remove(it)
                }

            have.forEach {
                when {
                    it - 1 in losts -> losts.remove(it - 1)
                    it + 1 in losts -> losts.remove(it + 1)
                }
            }

            return n - losts.count()
        }
    }
}
