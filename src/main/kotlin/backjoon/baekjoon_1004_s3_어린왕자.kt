package backjoon

/**
 * @author Hwandong Joo
 */

import java.io.*
import java.util.StringTokenizer
import kotlin.math.*

/**
 * https://www.acmicpc.net/problem/1004
 */

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val res = StringBuilder()
    var T = br.readLine().toInt()

    while (T-- > 0) {
        var answer = 0
        var st = StringTokenizer(br.readLine())
        val startX = st.nextToken().toInt()
        val startY = st.nextToken().toInt()
        val endX = st.nextToken().toInt()
        val endY = st.nextToken().toInt()
        val N = br.readLine().toInt()

        val arr = mutableListOf<Planet>()

        for (i in 0 until N) {
            st = StringTokenizer(br.readLine())
            val x = st.nextToken().toDouble()
            val y = st.nextToken().toDouble()
            val radius = st.nextToken().toDouble()
            var startIsIn = false
            var endIsIn = false
            if ((startX - x).pow(2) + (startY - y).pow(2) > radius.pow(2)) {
                startIsIn = true
            }
            if ((endX - x).pow(2) + (endY - y).pow(2) > radius.pow(2)) {
                endIsIn = true
            }
            if (startIsIn.xor(endIsIn)) answer++
        }
        res.append(answer).append("\n")
    }
    print(res)
}

class Planet(
    val x: Int,
    val y: Int,
    val radius: Int
)


