import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
  var a = nextInt()
  var b = nextInt()
  var remain = b
  while(remain>0) {
    println(a*(remain%10))
    remain /= 10
  }
  println(a*b)
}