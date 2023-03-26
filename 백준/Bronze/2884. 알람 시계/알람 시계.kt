fun main() {
  var (h, m) = readLine()!!.split(" ").map{ it.toInt() }
  m -= 45
  if (m < 0) {
    m += 60
    h -= 1
    if (h < 0) {
      h += 24
    }
  }
  print("$h $m")
}