package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */

fun main(args: Array<String>) {
    println(
        P42840.solution(
            intArrayOf(1, 2, 3, 4, 5)
        ).toList()
    )
    println(
        P42840.solution(
            intArrayOf(1, 3, 2, 4, 2)
        ).toList()
    )
}

private class P42840 {
    companion object {

        val first = listOf(1, 2, 3, 4, 5)
        val second = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val third = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        fun solution(answers: IntArray): IntArray {
            val hits = intArrayOf(0, 0, 0)

            answers.forEachIndexed { index, i ->
                hits[0] += if (first[index % 5] == i) 1 else 0
                hits[1] += if (second[index % 8] == i) 1 else 0
                hits[2] += if (third[index % 10] == i) 1 else 0
            }
            val max = hits.maxOrNull() ?: 0
            val answer = mutableListOf<Int>()
            hits.forEachIndexed { index, i ->
                if (i == max) {
                    answer.add(index+1)
                }
            }
            return answer.toIntArray()
        }
    }
}
