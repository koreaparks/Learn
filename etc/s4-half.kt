/*
  TCES 에서 오류 발생
*/

class Solution {
    fun solution(board: Array<Array<String>>, word: String): Boolean {
        var search : Array<Array<Boolean>>

        var w = word.chunked(1)
        var wIndex: Int
        var x: Int
        var y: Int
        var goX: Int
        var goY: Int
        var dx = intArrayOf(0,0,-1,1)
        var dy = intArrayOf(-1,1,0,0)

        for (i in board.indices) {
            for (j in board[i].indices) {
                wIndex = 0

                if (w[wIndex] == board[i][j]) {
                    wIndex++
                    search = Array(board.size) { Array(board[0].size) {false}}
                    search[i][j] = true
                    x = j
                    y = i

                    var run = true
                    while (run && wIndex < word.length -1) {
                        run = false

                        for (k in 0 .. 3) {
                            goX = x + dx[k]
                            goY = y + dy[k]

                            if (goY < 0 || goY > board.size - 1
                            || goX < 0 || goX > board[0].size - 1
                            || search[goY][goX] || board[goY][goX] != w[wIndex])
                                continue

                            x = goX
                            y = goY
                            wIndex++
                            search[y][x] = true
                            run = true
                            break
                        }
                    }

                    if (wIndex >= word.length - 1) {
                        return true
                    }
                }
            }
        }

        return false
    }
}
