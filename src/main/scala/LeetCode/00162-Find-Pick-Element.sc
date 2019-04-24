object Solution {
  def findPeakElement(nums: Array[Int]): Int = {
    def findPeak(l: Int, r: Int): Int = {
      if(l == r) return l
      val mid = (l + r)/2
      if(nums(mid) < nums(mid + 1)) findPeak(mid + 1, r)
      else findPeak(l, mid)
    }
    findPeak(0, nums.length - 1)
  }
}