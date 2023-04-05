class Solution {
    fun solution(babbling: Array<String>): Int {
      var answer: Int = 0
      for (str in babbling) { // 문자열 배열을 순회하며
        var remain = str.length
        if (str.contains("aya")) remain -= 3
        if (str.contains("ye")) remain -= 2
        if (str.contains("woo")) remain -= 3
        if (str.contains("ma")) remain -= 2

        if (remain == 0) answer++
      }
      return answer
    }
}