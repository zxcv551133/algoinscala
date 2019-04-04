object Solution {
  def isPalindrome(x: Int): Boolean = {
    val check = x.toString
    for(i <- 0 until check.length/2) {
      if(check(i) != check(check.length - i - 1)) return false
    }
    true
  }
}

Solution.isPalindrome(-121)