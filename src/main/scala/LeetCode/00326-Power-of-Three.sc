object Solution {
  def isPowerOfThree(n: Int): Boolean = {
    val MAXIMAMPOWEROFTHREE = 1162261467
    n >= 1 && (MAXIMAMPOWEROFTHREE % n == 0)
  }
}