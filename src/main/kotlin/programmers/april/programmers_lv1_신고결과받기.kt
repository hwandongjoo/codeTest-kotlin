package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/92334
 */

fun main(args: Array<String>) {
    println(
        P92334.solution(
            id_list = arrayOf("muzi", "frodo", "apeach", "neo"),
            report = arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
            k = 2
        ).toList()
    )
    println(
        P92334.solution(
            id_list = arrayOf("con", "ryan"),
            report = arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
            k = 3
        ).toList()
    )
}

private class P92334 {
    companion object {

        fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
            val reportByWho = mutableMapOf<String, MutableSet<String>>()
            val reportSuccess = mutableMapOf<String, Int>()
            id_list.forEach {
                reportByWho[it] = mutableSetOf()
                reportSuccess[it] = 0
            }
            report.forEach {
                val (user, reported) = it.split(" ")
                reportByWho[reported]?.add(user)
            }
            reportByWho.forEach { (user, reported) ->
                if (reported.count() >= k) {
                    reported.forEach {
                        reportSuccess[it] = reportSuccess[it]!! + 1
                    }
                }
            }

            return reportSuccess.values.toIntArray()
        }
    }
}
