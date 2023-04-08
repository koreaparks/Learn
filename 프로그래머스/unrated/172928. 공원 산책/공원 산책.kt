class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        //var answer: IntArray = intArrayOf()

        var ph = 0
        var pw = 0

        val parkList : List<List<String>> = park.mapIndexed { h, it ->
            val row = it.chunked(1)
            val w = row.indexOf("S")
            if (w > -1) { ph = h; pw = w }

            row
        }

        var aaaaaaaa = routes.map {
            val z = it.split(" ")
            z[0] to z[1].toInt()
        }.forEach {
            var tmp = 0
            when (it.first) {
                "E" -> {
                    if (pw + it.second < park[0].length) {
                        for (i:Int in 1..it.second) {
                            tmp++
                            if (parkList[ph][pw+i] == "X") {
                                tmp=0
                                break
                            }
                        }
                        pw += tmp
                    }
                }
                "W" -> {
                    if (pw - it.second >= 0) {
                        for (i:Int in 1..it.second) {
                            tmp++
                            if (parkList[ph][pw-i] == "X") {
                                tmp=0
                                break
                            }
                        }
                        pw -= tmp
                    }
                }
                "S" -> {
                    if (ph + it.second < park.count()) {
                        for (i:Int in 1..it.second) {
                            tmp++
                            if (parkList[ph+i][pw] == "X") {
                                tmp=0
                                break
                            }
                        }
                        ph += tmp
                    }
                }
                "N" -> {
                    if (ph - it.second >= 0) {
                        for (i:Int in 1..it.second) {
                            tmp++
                            if (parkList[ph-i][pw] == "X") {
                                tmp=0
                                break
                            }
                        }
                        ph -= tmp
                    }
                }
            }
        }

        return intArrayOf(ph, pw)
    }
}