fun main() {
  var a = readLine()!!.toInt()
  print(
    when {
      (a%4 == 0 && a%100 != 0) || a%400 == 0 -> 1
      else -> 0
    }
  )
}