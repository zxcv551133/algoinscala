import scala.collection.mutable

object Solution {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    val sortedNums = nums.sortWith(_ < _)
    val ret = mutable.Set[List[Int]]()

    def go(idx:Int): Unit = {
      var l = 0
      var r = nums.length - 1
      while(l < idx && r > idx) {
        if(sortedNums(l) + sortedNums(r) + sortedNums(idx) == 0) {
          ret.add(List(sortedNums(l), sortedNums(idx), sortedNums(r)))
          r -= 1
        } else if(sortedNums(l) + sortedNums(r) + sortedNums(idx) > 0) {
          r -= 1
        } else {
          l += 1
        }
      }
    }
    for(i <- 1 until nums.length - 1) {
      go(i)
    }
    ret.toList
  }
}

Solution.threeSum(Array(-1,0,1,2,-1,4))
