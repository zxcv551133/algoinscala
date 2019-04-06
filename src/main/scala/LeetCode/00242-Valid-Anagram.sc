object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    s.sortWith(_ < _) == t.sortWith(_ < _)
  }
}