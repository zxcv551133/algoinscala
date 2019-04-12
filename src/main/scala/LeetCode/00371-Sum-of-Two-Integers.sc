object Solution {
  def getSum(a: Int, b: Int): Int = {
    if (a == 0) b
    else getSum((a & b) << 1, a ^ b)
  }
}

Solution.getSum(7,8)