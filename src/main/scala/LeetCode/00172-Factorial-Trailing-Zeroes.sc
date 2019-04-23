object Solution {
  def trailingZeroes(n: Int): Int = n match {
    case 0 => 0
    case _ => n/5 + trailingZeroes(n/5)
  }
}