// 미완 time complexity O(n) extra space O(1)


object Solution {
  def rotate(nums: Array[Int], k: Int): Unit = {
    for(i <- 0 until k;
        j <- 0 until nums.length;
    temp <- nums((j + 1) % nums.length) to nums((j+1) % nums.length)) {

    }
  }
}
Solution.rotate(Array(1,2,3), 3)