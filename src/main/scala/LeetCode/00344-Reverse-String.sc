object Solution {
  def reverseString(s: Array[Char]): Unit = {
    val len = s.length
    for(i <- 0 until len/2) {
      val temp = s(i)
      s(i) = s(len - 1 - i)
      s(len -1 -i) = temp
    }
  }
}

// TLE 발생