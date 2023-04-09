/*
    쉬움..
*/

class Solution {
    fun solution(str: String): String {
        val moeum = arrayOf("a", "e", "i", "o", "u")
        val mo: MutableList<Pair<Int, String>> = mutableListOf()
        val strList = str.chunked(1).toMutableList()

        strList.forEachIndexed { i, it ->
            if (moeum.contains(it.lowercase())) {
                mo += i to it
            }
        }

        var lastIndex = mo.count() - 1
        mo.forEachIndexed { i, it ->
            strList[it.first] = mo[lastIndex].second
            lastIndex--
        }

        return strList.joinToString("")
    }
}
