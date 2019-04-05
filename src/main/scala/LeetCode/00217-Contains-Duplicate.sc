object Solution {
  def containsDuplicate(nums: Array[Int]):Boolean = {
    nums.toSet.size != nums.length
  }
}

Solution.containsDuplicate(Array(1,2,3,1))