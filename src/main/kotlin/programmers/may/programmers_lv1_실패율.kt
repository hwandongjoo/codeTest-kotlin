package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */

fun main(args: Array<String>) {
    println(
        P42889.solution(
            5, intArrayOf(2, 1, 2, 6, 2, 4, 3, 3)
        ).toList()
    )
    println(
        P42889.solution(
            4, intArrayOf(4, 4, 4, 4, 4)
        ).toList()
    )
}

private class P42889 {
    companion object {

        fun solution(N: Int, stages: IntArray): IntArray {
            val failMap = mutableMapOf<Double, MutableList<Int>>()
            repeat(N) { num ->
                val fail = stages.count { it == num + 1 }
                val left = stages.count { it >= num + 1 }
                if(left ==0 ){
                    failMap[0.0]?.add(num+1) ?: failMap.put(0.0, mutableListOf(num + 1))
                }else{
                failMap[fail.toDouble() / left]?.add(num + 1)
                    ?: failMap.put(fail.toDouble() / left, mutableListOf(num + 1))
                }

            }
            return failMap.toSortedMap().values.reversed().flatten<Int>().toIntArray()
        }

//        fun solution(N: Int, stages: IntArray): IntArray {
//            return Array(N) {
//                val fail = stages.count { s -> s == it + 1 }.toDouble()
//                val total = stages.count { s -> s >= it + 1 }.toDouble()
//                Stage(it + 1, if (total == 0.0) 0.0 else fail / total)
//            }.sorted().map { it.step }.toIntArray()
//        }
//
//        class Stage(val step: Int, val fail: Double) : Comparable<Stage> {
//            override fun compareTo(other: Stage): Int {
//                return other.fail.compareTo(this.fail)
//            }
//        }
    }
}
