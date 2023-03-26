fun main() {
  var (x, y) = List(2) {readLine()!!.toInt()}
  print(
    when {
      x>0 && y>0 -> 1
      x<0 && y>0 -> 2
      x<0 && y<0 -> 3
      else -> 4
    }
  )
}