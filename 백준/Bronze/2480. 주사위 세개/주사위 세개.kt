fun main() {
  var (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
  var max: Int

  if (a == b) {
    if (b == c) {
      print(a * 1000 + 10000)
    } else {
      print(a * 100 + 1000)
    }
  } else if (b == c || c == a) {
    print(c * 100 + 1000)
  } else {
    max = if (a > b) a else b
    if (c > max) {
      max = c
    }
    print((if (c > max) c else max) * 100)
  }
}