class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerRank: MutableMap<String, Int> = players.mapIndexed { index, it -> it to index }.toMap().toMutableMap()
        val rankPlayer = playerRank.map { it.value to it.key }.toMap().toMutableMap()

        callings.forEach {
            val bRank: Int = playerRank.getValue(it)
            val aPlayer = rankPlayer.getValue(bRank - 1)
            playerRank[it] = bRank - 1
            playerRank[aPlayer] = bRank
            rankPlayer[bRank] = aPlayer
            rankPlayer[bRank-1] = it
        }
        
        return rankPlayer.values.toTypedArray()
    }

    /*
    시간초과 코드
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        callings.map {
            // 첫 번째 선수는 불일 일이 없으므로 .map 을 사용하지 않고 for문으로 index 1 부터 탐색
            val i = players.indexOf(it)
            val tmp = players[i-1]
            players[i-1] = it
            players[i] = tmp
        }
        return players
    }
    */
}