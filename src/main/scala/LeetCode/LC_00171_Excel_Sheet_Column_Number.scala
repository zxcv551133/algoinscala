package LeetCode

object LC_00171_Excel_Sheet_Column_Number {
  def titleToNumber(s: String): Int = {
    s.foldRight((1, 0))((x, a) => (a._1 * 26, a._1 * (x - 'A' + 1) + a._2))._2
  }
  def main(args: Array[String]): Unit = {
    println(titleToNumber("ZY"))
    println(titleToNumber("AA"))
  }
}
