package programmers

/*
 * written by hjoo
 */


import java.io.*
import java.util.*

/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/64061
 */

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    println(
        P64061.solution(
            board = arrayOf(
                intArrayOf(0, 0, 0, 0, 0),
                intArrayOf(0, 0, 1, 0, 3),
                intArrayOf(0, 2, 5, 0, 1),
                intArrayOf(4, 2, 4, 4, 2),
                intArrayOf(3, 5, 1, 3, 1)
            ), moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
        )
    )
}

private class P64061 {
    companion object {

        fun solution(board: Array<IntArray>, moves: IntArray): Int {
            var answer = 0
            val box: Stack<Int> = Stack()
            val maxSize = board.size - 1

            for (x in moves) {
                for (y in 0..maxSize) {
                    if (board[y][x - 1] != 0) {
                        if (box.isNotEmpty() && box.peek() == board[y][x - 1]) {
                            box.pop()
                            answer += 1
                        } else {
                            box.push(board[y][x - 1])
                        }
                        board[y][x - 1] = 0
                        break
                    }
                }
            }
            return answer * 2
        }
    }
}
