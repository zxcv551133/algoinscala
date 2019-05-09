package LeetCode

import scala.annotation.tailrec


// TODO 해당 문제는 스칼라로 제출 시 입력만으로 TLE 에 걸리는 상황으로 스칼라로는 풀 수 없다.
object LC_00238_Product_of_Array_Except_Self {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val ret = new Array[Int](nums.size);

    // TODO tailrec 으로 구현해보자 stack overflow 예방
    def getProduct(i: Int, prev: Int, numSize: Int): Int = i match {
      case _ if i == numSize => 1
      case _ => {
        val next = getProduct(i + 1, prev * nums(i), numSize)
        ret(i) = prev * next
        nums(i) * next
      }
    }
    getProduct(0, 1, nums.size)
    ret
  }

  def main(args: Array[String]): Unit = {
    productExceptSelf(Array(1,2,3,4,5)).foreach(println)
  }
}
