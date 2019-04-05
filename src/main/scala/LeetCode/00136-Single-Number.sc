object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    (nums :+ 0).foldLeft(0)(_ ^ _)
  }
}