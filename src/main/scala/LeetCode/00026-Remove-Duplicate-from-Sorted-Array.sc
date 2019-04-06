object Solution {
  def removeDuplicates(nums: Array[Int]): Any = {
    if(nums.length <= 1) return nums.length
    var alt = 1
    for(i <- 1 until nums.length) {
      if(nums(i-1) != nums(i)) {
        nums(alt) = nums(i)
        alt += 1
      }
    }

    (nums,alt)
  }
}

Solution.removeDuplicates(Array(1,2,3))