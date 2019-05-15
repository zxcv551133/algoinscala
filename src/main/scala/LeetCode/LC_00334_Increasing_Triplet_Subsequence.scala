package LeetCode

object LC_00334_Increasing_Triplet_Subsequence {
  def increasingTriplet(nums: Array[Int]): Boolean = {
    nums.foldLeft((Int.MaxValue, Int.MaxValue, false))((a, b) => {
      if(a._1 >= b) (b, a._2, a._3)
      else if(a._2 >= b) (a._1, b, a._3)
      else (a._1, a._2, true)
    })._3
  }
  def main(args: Array[String]): Unit = {
    println(increasingTriplet(Array(1,3,2,2,5)))
  }
}
