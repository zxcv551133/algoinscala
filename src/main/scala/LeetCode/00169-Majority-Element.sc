// Sorting tc O(nlogn) sc O(n)



object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    nums.sortWith(_ < _)(nums.length /2)
  }
}

// O(n) O(1) Boyer-Moore