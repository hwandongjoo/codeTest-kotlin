package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/76501
 */

fun main(args: Array<String>) {
    println(
        P76501.solution(
            intArrayOf(4, 7, 12),
            booleanArrayOf(true, false, true)
        )
    )
    println(
        P76501.solution(
            intArrayOf(1, 2, 3),
            booleanArrayOf(false, false, true)
        )
    )
}

private class P76501 {
    companion object {

        fun solution(absolutes: IntArray, signs: BooleanArray): Int {
            var answer: Int = 0
            absolutes.forEachIndexed { index, i ->
                when(signs[index]){
                    true -> answer += i
                    false -> answer -= i
                }
            }

            return answer
        }
    }
}
