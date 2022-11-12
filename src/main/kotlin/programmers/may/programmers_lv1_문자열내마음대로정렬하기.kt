package programmers

/*
 * written by hjoo
 */


/**
 * 문제 링크
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */

fun main(args: Array<String>) {
    println(
        P12915.solution(
            arrayOf("sun", "bed", "car"), 1
        ).toList()
    )
    println(
        P12915.solution(
            arrayOf("abce", "abcd", "cdx"), 2
        ).toList()
    )
}

private class P12915 {
    companion object {
        fun solution(strings: Array<String>, n: Int): Array<String> {
            return strings.sortedWith { o1, o2 ->
                if (o1[n] > o2[n]) {
                    1
                } else if (o1[n] == o2[n]) {
                    o1.compareTo(o2)
                } else {
                    -1
                }
            }.toTypedArray()
        }
    }
}
