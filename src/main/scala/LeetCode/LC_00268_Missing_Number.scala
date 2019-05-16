package LeetCode

object LC_00268_Missing_Number {
  // TODO implement function using only constatnt extra space complexity
  // TODO Hint: there are more than 2 ways to implement with this condition.
  def missingNumber(nums: Array[Int]): Int = {
    val array = new Array[Boolean](nums.length + 1)
    nums.foreach(array(_) = true)
    (0 to nums.length).find(i => !array(i)).head
  }
  def main(args: Array[String]): Unit = {
    println(missingNumber(Array(0,3,1,4,5)))
  }
}
