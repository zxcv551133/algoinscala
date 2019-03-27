
// O(1)
object Solution {
  def reverse(x: Int): Int = {
    val absX = Math.abs(x.toLong)
    val ret = absX.toString.reverse.toLong * {
      if(x < 0)
        -1
      else 1
    }

    if(ret >= (1.toLong << 31) || ret <= - (1.toLong << 31) - 1)
      0
    else
      ret.toInt
  }
}


Solution.reverse(120)
Solution.reverse(-120)

Solution.reverse(123)