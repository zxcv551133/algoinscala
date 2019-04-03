object Solution {
  def largestRectangleArea(heights: Array[Int]): Int = {
    val newHeights = Array(0) ++ heights ++ Array(0)
    var stack = List[Int]()
    stack = 0 :: stack
    var ans = 0
    for(i <- 1 until newHeights.length) {
      while(newHeights(stack.head) > newHeights(i)) {
        val h = newHeights(stack.head)
        stack = stack.tail
        val w = i - stack.head - 1

        println(i + " " + h + " " + w)
        ans = Math.max(ans, h*w)
      }
      stack = i :: stack
    }
    ans
  }
}

Solution.largestRectangleArea(Array(2,0,1,1,2))