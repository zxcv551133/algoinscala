package LeetCode

import scala.annotation.tailrec

object LC_00279_Perfect_Squares {


  // TODO: 더 빠르게 변경
  def numSquares(n: Int): Int = {
    val dp = collection.mutable.Map[Int, Int]()
    dp.put(0, 0)
    def buildDp(x: Int): Unit = {
      (1 to x).filter(v => v * v <= x).foreach(y => dp.put(x, math.min(dp.getOrElse(x, x), 1 + dp(x - y * y))))
    }
    (1 to n).foreach(buildDp)
    dp(n)
  }

  def main(args: Array[String]): Unit = {
    println(numSquares(1))
    println(numSquares(13))
    println(numSquares(12))
    println(numSquares(16))
    println(numSquares(1000))
  }

}
