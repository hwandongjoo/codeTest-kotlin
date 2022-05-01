package programmers

import kotlin.math.*

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12977?language=kotlin
 */

fun main(args: Array<String>) {
    println(
        P12977.solution(
            intArrayOf(1, 2, 3, 4),
        )
    )
    println(
        P12977.solution(
            intArrayOf(1, 2, 7, 6, 4),
        )
    )
}

private class P12977 {
    companion object {
        val sosu:List<Int> by lazy {
            val list = mutableListOf<Int>(2,3)
            var i = 4
            while(i <= 998+999+1000){
                var isSosu = true
                for(j in 2..sqrt(i+0.0).toInt()){
                    if(i % j == 0) {
                        isSosu = false
                        break
                    }
                }
                if(isSosu){
                    list.add(i)
                }
                i++
            }

            return@lazy list
        }
        fun solution(nums: IntArray): Int {
            var answer = 0
            println(sosu)
            for (i in nums.indices) {
                for (j in i + 1 until nums.size) {
                    for (k in j+1 until nums.size){
                        if(nums[i] + nums[j] + nums[k] in sosu){
                            answer++
                        }
                    }
                }
            }

            return answer
        }
    }
}
