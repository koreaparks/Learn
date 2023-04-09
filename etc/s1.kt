/*
    쉬움..
*/

class Solution {
    fun solution(numbers: IntArray, goal: Int): IntArray {
        val split = numbers.mapIndexed { index, it -> index to it}
                            .filter { it.second < goal }

        for (i in 0..split.count()) {
            //기준점
            val now = split[i]

            split.forEachIndexed { index, it ->
                if (index == i) return@forEachIndexed

                if (now.second + it.second == goal) {
                    return intArrayOf(now.first, it.first)
                }
            }
        }

        return intArrayOf()
    }
}
