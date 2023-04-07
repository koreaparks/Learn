class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        // 빠른 비교를 위해 날짜를 정수로 치환
        val (y, m, d) = today.split(".").map { it.toInt() }
        val iToday = y*336 + m*28 + d

        // terms 를 map 으로 변환
        val termsMap: Map<String, Int> = terms.associate {
            val (l, r) = it.split(" ")
            l to r.toInt()*28
        }

        privacies.forEachIndexed { index, it ->
            // 오늘 날짜와 비교 대상 날짜에 약관 종류에 따른 추가 값을 비교
            val (ty, tm, td, tTerm) = it.split("[. ]".toRegex())
            val iSearch: Int = ty.toInt()*336 + tm.toInt()*28 + td.toInt()
            if (iToday >= iSearch + termsMap.getValue(tTerm)) {
                answer += index + 1
            }
        }

        return answer
    }
}