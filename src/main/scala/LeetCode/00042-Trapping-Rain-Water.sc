object Solution {
  def trap(height: Array[Int]): Int = {
    if(height.length == 0) return 0
    val right = new Array[Int](height.length)
    val left = new Array[Int](height.length)
    left(0) = height(0)
    right(height.length-1) = height(height.length -1)
    for(i <- 1 until height.length) {
      left(i) = Math.max(left(i-1), height(i))
    }
    for(i <- Range(height.length -2, -1, -1)) {
      right(i) = Math.max(right(i+1), height(i))
    }
    var ans = 0
    for(i<- 0 until height.length) {
      ans += Math.max(0, Math.min(right(i), left(i)) - height(i))
    }
    ans
  }
}


Solution.trap(Array(0,1,0,2,1,0,1,3,2,1,2,1))
