import scala.annotation.tailrec

object Solution {
  def rob(nums: Array[Int]): Int = {
    @tailrec
    def recursive(i: Int, pastA: Int, pastB: Int): Int = {
      if(i == nums.length) Math.max(pastA, pastB)
      else recursive(i+1, pastB + nums(i), Math.max(pastA, pastB))
    }
    recursive(0, 0, 0)
  }
}

Solution.rob(Array(1,2,3,1))
Solution.rob(Array(2,7,9,3,1))