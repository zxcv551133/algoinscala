import scala.annotation.tailrec

object Solution {
  def findPeakElement(nums: Array[Int]): Int = {
    @tailrec
    def findPeak(l: Int, r: Int): Int = {
      if(l == r) return l
      val mid = (l + r)/2
      if(nums(mid) < nums(mid + 1)) findPeak(mid + 1, r)
      else findPeak(l, mid)
    }
    findPeak(0, nums.length - 1)
  }
}

Solution.findPeakElement(Array(1,2,3))
Solution.findPeakElement(Array(1,2,1))
