import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Solution {
  def countAndSay(n: Int): String = {
    if(n == 1) return "1"
    var temp = 1;
    var ret = ""
    val before = countAndSay(n-1)
    for(i <- 1 until before.length) {
      if(before(i) == before(i-1)) {
        temp += 1
      } else {
        ret += temp.toString + before(i-1)
        temp = 1
      }
    }
    ret += temp.toString + before(before.size - 1)
    ret
  }
}

Solution.countAndSay(5)


val fut = Future {Thread. sleep(10000); 21 + 21}
val result = fut.map(_ + 1)
result.value
result.value
result.value
result.value

