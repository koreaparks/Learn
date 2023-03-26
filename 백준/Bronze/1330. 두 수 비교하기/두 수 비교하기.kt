fun main() {
  var a = readLine()!!.split(" ").map {it.toInt()}
  if (a[0]>a[1]) print(">")
  else if (a[0]<a[1]) print("<")
  else print("==")
}