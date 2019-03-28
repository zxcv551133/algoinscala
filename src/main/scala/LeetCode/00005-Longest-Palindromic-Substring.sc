object Solution {
  def longestPalindrome(s: String): String = {
  }

  // 홀 짝 경우
  def longestPalindromeByIndex(s: String, ret: String, idx: Int):String = {
    if(idx == s.length) ret
    else {
      for(i <- idx until s.length) {
        if(2 * idx - i  < 0) {

        }
      }
    }
  }
}