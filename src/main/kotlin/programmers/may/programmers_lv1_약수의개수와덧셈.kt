package programmers

import java.util.LinkedList
import java.util.Queue

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 */

fun main(args: Array<String>) {
    println(
        P77884.solution(
            13, 17
        )
    )
    println(
        P77884.solution(
            24, 27
        )
    )
}

private class P77884 {
    companion object {

        fun solution(left: Int, right: Int): Int {
            var answer: Int = 0
            var count = 2
            for(i in left..right){
                count = 1
                for(j in 1..i/2){
                    if(i%j == 0){
                        count++
                    }
                }
                if(count%2 ==0){
                    answer +=i
                }else{
                    answer -= i
                }
            }
            return answer
        }
    }
}
