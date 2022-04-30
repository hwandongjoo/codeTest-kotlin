package backjoon

/**
 * @author Hwandong Joo
 */

import java.io.*

/**
 * https://www.acmicpc.net/problem/1009
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var T = br.readLine().toInt()
    while (T-- > 0) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }.let {
            it.first() to it.last()
        }
        var answer = 1
        for (i in 0 until y) {
            answer = (answer * x) % 10
        }
        if (answer == 0) answer = 10
        println(answer)
    }
}
