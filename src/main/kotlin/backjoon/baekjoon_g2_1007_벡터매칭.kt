package backjoon

/**
 * @author Hwandong Joo
 */

import java.io.*
import kotlin.math.*

/**
 * https://www.acmicpc.net/problem/1007
 */

private var isVisited = BooleanArray(0)
private var N = 0
private var result = 0.0
private var points = mutableListOf<Point>()
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var T = br.readLine().toInt()
    while (T-- > 0) {
        N = br.readLine().toInt()
        points = mutableListOf()
        isVisited = BooleanArray(N)
        result = Double.MAX_VALUE
        while (N-- > 0) {
            val point = Point(br.readLine().split(" ").map { it.toInt() })
            points.add(point)
        }
        combination(0, points.size / 2)
        println(result)
    }
}

private fun combination(idx: Int, count: Int) {
    if (count == 0) {
        result = min(result, getVector())
    } else {
        for (i in idx until points.size) {
            isVisited[i] = true
            combination(i + 1, count - 1)
            isVisited[i] = false
        }
    }
}

private fun getVector(): Double {
    var x = 0.0
    var y = 0.0
    for (i in 0 until points.size) {
        if (isVisited[i]) {
            x += points[i].x
            y += points[i].y
        } else {
            x -= points[i].x
            y -= points[i].y
        }
    }
    return sqrt(x.pow(2) + y.pow(2))
}

private class Point(
    val x: Int, val y: Int
) {
    constructor(list: List<Int>) : this(
        list.first(), list.last()
    )
}
