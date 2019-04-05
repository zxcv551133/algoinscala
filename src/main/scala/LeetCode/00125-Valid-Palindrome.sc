import scala.annotation.tailrec

object Solution {
  def isPalindrome(s: String): Boolean = {
    val cs = s.toLowerCase.filter( x => (x >= 'a' && x <= 'z') || (x >= '0' && x <= '9'))
    if(cs.length <= 1) return true
    def isPalindrome(i:Int): Boolean = {
      if(i == cs.length/2 + 1) true
      else if(cs(i) == cs(cs.length - i - 1)) isPalindrome(i+1)
      else false
    }
    isPalindrome(0)
  }
}


Solution.isPalindrome("A man, a plan, a canal: Panama")
Solution.isPalindrome("A a")
Solution.isPalindrome("8v8k;g;k;v;")