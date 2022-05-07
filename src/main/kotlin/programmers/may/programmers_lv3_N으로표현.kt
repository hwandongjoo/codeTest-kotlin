package programmers

import java.util.LinkedList
import java.util.Queue

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/42895
 */

fun main(args: Array<String>) {
    println(
        P42895.solution(
            5, 12
        )
    )
    println(
        P42895.solution(
            2, 11
        )
    )
}

private class P42895 {
    companion object {

        fun solution(N: Int, number: Int): Int {
            val dp: Array<MutableSet<Int>> = Array(8) { mutableSetOf() }
            if (number == N){
                return 1
            }
            for (k in 0 until 8) {
                dp[k].add(seriesNum(N, k))
            }

            for (i in 1 until 8) {
                for(j in 0 until i){
                    for(a in dp[j]){
                        for(b in dp[i-j-1]){
                            dp[i].add(a+b)
                            dp[i].add(a-b)
                            dp[i].add(a*b)
                            dp[i].takeIf { b !=0 }?.add(a/b)
                        }
                    }
                }
                if(number in dp[i]){
                    return i+1
                }
            }
            return -1
        }


        fun seriesNum(number: Int, k: Int): Int {
            val sb = StringBuilder()
            sb.append(number)
            repeat(k) {
                sb.append(number)
            }
            return sb.toString().toInt()
        }
    }
}
