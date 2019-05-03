package LeetCode

import scala.annotation.tailrec

object LC_00179_Largest_Number {
  def largestNumber(nums: Array[Int]): String = {

//    TODO: deleteLeadingZero 시간복잡도 개선
    def deleteLeadingZero(x: String): String = {
      if(x.head != '0' || x.size == 1) x
      else deleteLeadingZero(x.drop(1))
    }
    def ord(x: String, y: String): Boolean = x + y > y + x
    deleteLeadingZero(nums.sortWith((x,y) => ord(x.toString , y.toString)).foldLeft("")(_ + _.toString))
  }

  def main(args: Array[String]): Unit = {
    println(largestNumber(Array(3,30,34,5,9)))
    println(largestNumber(Array(0,0)))

  }
}
