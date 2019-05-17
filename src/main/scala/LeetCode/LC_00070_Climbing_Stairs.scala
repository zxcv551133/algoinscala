package LeetCode

import scala.annotation.tailrec

object LC_00070_Climbing_Stairs {
  def climbStairs(n: Int): Int = {
    def getAnsByTailRec(pPre: Int, pre: Int, cur: Int): Int = {
      if(cur == n) pre
      else getAnsByTailRec(pre, pPre + pre, cur + 1)
    }
    getAnsByTailRec(0, 1, 0)
  }

  def main(args: Array[String]): Unit = {
    println(climbStairs(5))
    println(climbStairs(3))
    println(climbStairs(2))
    println(climbStairs(1))
    println(climbStairs(0))
  }
}
