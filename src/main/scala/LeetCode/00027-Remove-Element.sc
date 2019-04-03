// extra memory O(1)

object Solution {
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    var l = 0
    var r = nums.length
    while(l < r) {
      if(nums(l) == `val`) {
        nums(l) = nums(r-1)
        r -= 1
      } else {
        l += 1
      }
    }
    r
  }
}

Solution.removeElement(Array(3,2,2,3), 3)