package programmers

import java.util.*

/**
 * @author Hwandong Joo
 */
fun main(args: Array<String>) {
    println(solution(2, 10, intArrayOf(7, 4, 5, 6)))
    println(solution(100, 100, intArrayOf(10)))
    println(solution(100, 100, intArrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10)))
}

private fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
    var answer = 0
    // 다리
    val bridge: Queue<Int> = LinkedList()
    // 대기
    val wait: Queue<Int> = LinkedList()

    repeat(bridge_length) {
        bridge.add(0)
    }
    truck_weights.forEach {
        wait.offer(it)
    }

    while (bridge.isNotEmpty()) {
        answer++
        bridge.poll()
        if (wait.isNotEmpty()) {
            if (bridge.sum() <= weight - wait.peek()) {
                bridge.offer(wait.poll())
            } else {
                bridge.add(0)
            }
        }
    }
    return answer
}
