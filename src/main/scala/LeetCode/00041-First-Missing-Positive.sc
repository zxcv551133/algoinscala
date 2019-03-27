// O(n)
object Solution {
  def firstMissingPositive(nums: Array[Int]): Int = {
    val numSet = collection.mutable.Set[Int]()
    for(i <- 0 until nums.length) {
      numSet += nums(i)
    }
    for(i <- 1 until nums.length + 2) {
      if(!numSet(i)) return i
    }
    0
  }
}

Solution.firstMissingPositive(Array())