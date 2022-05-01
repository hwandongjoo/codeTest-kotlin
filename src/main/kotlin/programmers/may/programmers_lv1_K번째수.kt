package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */

fun main(args: Array<String>) {
    println(
        P42748.solution(
            intArrayOf(1, 5, 2, 6, 3, 7, 4),
            arrayOf(
                intArrayOf(2, 5, 3),
                intArrayOf(4, 4, 1),
                intArrayOf(1, 7, 3)
            )
        ).toList()
    )
}

private class P42748 {
    companion object {

        fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
            return commands.map { cmd ->
                array.slice(IntRange(cmd[0] - 1, cmd[1]-1)).sorted()[cmd[2]-1]
            }.toIntArray()
        }
    }
}
