package LeetCode

import scala.annotation.tailrec

object LC_00202_Happy_Number {
  def isHappy(n: Int): Boolean = {
    // TODO floyd cycle detection 으로 set 을 사용하지 않고 풀기
    def getHappy(x: Int, visit: Set[Int]): Boolean = {
      if(x == 1) true
      else if(visit(x)) false
      else
        getHappy((for(c <- x.toString) yield c.toInt - '0' ).foldLeft(0)((a, b) => a + b * b), visit + x)
    }
    getHappy(n, Set[Int]())
  }
  def main(args: Array[String]): Unit = {
    println(isHappy(19))
  }
}
