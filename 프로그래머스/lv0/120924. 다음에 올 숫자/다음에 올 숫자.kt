class Solution {
    fun solution(common: IntArray): Int {
        val cha = common[1] - common[0]
        if (common[2] - common[1] == cha) return common.last() + cha
        return common.last() * common[1] / common[0]
    }
}