fun main() {
  var (h, m) = readLine()!!.split(" ").map{ it.toInt() }
  var c = readLine()!!.toInt()

  m += c

  while (m > 59) {
    m -= 60
    if (++h > 23) {
      h -= 24
    }
  }
  print("$h $m")
}