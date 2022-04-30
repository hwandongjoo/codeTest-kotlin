package backjoon

/**
 * @author Hwandong Joo
 */

import java.io.*

/**
 * https://www.acmicpc.net/problem/1010
 */

// Bottum - up
private val dp = Array(30) { Array(30) { 0 } }
fun main2(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var T = br.readLine().toInt()
    for (i in 0 until 30) {
        dp[i][i] = 1
        dp[i][0] = 1
    }

    for (x in 2 until 30) {
        for (y in 1 until 30) {
            dp[x][y] = dp[x - 1][y] + dp[x - 1][y - 1]
        }
    }
    while (T-- > 0) {
        val (N, M) = br.readLine().split(" ").map { it.toInt() }.let {
            it.first() to it.last()
        }
        println(dp[M][N])
    }
}

// Top down
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var T = br.readLine().toInt()
    while (T-- > 0) {
        val (N, M) = br.readLine().split(" ").map { it.toInt() }.let {
            it.first() to it.last()
        }
        println(combi(M, N))
    }
}

private fun combi(n: Int, r: Int): Int {
    if (dp[n][r] > 0) {
        return dp[n][r]
    }
    if (n == r || r == 0) {
        dp[n][r] = 1
        return 1
    }
    dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r)
    return dp[n][r]
}
