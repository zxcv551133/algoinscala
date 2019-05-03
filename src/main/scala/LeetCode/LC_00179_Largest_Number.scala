package LeetCode


object LC_00179_Largest_Number {
  def largestNumber(nums: Array[Int]): String = {
    def ord(x: String, y: String): Boolean = x + y > y + x
    val ret = nums.sortWith((x,y) => ord(x.toString , y.toString)).foldLeft("")(_ + _.toString)
    if(ret.head == '0') "0"
    else ret
  }

  def main(args: Array[String]): Unit = {
    println(largestNumber(Array(3,30,34,5,9)))
    println(largestNumber(Array(0,0)))

  }
}
