//import scala.annotation.tailrec

object Solution {
  def maxSubArray(nums: Array[Int]): Int = {
    val preSum = new Array[Int](nums.length + 1)
    for(i <- 0 until nums.length) {
      preSum(i + 1) = preSum(i) + nums(i)
    }
    def maxCrossingSum(s:Int, m:Int, e:Int): Int = {
//      @tailrec
      def maxRightSum(i:Int, v:Int):Int = {
        if(i == e) Math.max(v,preSum(i+1) - preSum(m+1))
        else maxRightSum(i+1, Math.max(preSum(i+1) - preSum(m+1), v))
      }
//      @tailrec
      def maxLeftSum(i:Int, v:Int):Int = {
        if(i == s) Math.max(v, preSum(m) - preSum(i))
        else maxLeftSum(i-1, Math.max(v, preSum(m) - preSum(i)))
      }
      nums(m) + maxRightSum(m,- 1<<31) + maxLeftSum(m, - 1<<31)
    }

    def maxSubArraySum(s:Int, e:Int): Int = {
      if(s == e) {
        return nums(s)
      }
      val m = (s+e)/2
      List(maxSubArraySum(s, m), maxSubArraySum(m+1, e), maxCrossingSum(s,m,e)).max
    }

    maxSubArraySum(0,nums.length -1)
  }
}


Solution.maxSubArray(Array(1,1))