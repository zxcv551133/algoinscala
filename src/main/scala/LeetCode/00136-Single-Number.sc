object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    nums.foldLeft(0)(_ ^ _) ^ 0
  }
}