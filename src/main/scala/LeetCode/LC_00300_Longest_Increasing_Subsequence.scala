package LeetCode

import scala.annotation.tailrec

object LC_00300_Longest_Increasing_Subsequence {
  def lengthOfLIS(nums: Array[Int]): Int = {

    @tailrec
    def lowerBound(v: Vector[Int], x: Int, lo: Int, hi: Int): Int = {
      if(lo + 1 == hi) return hi
      val mi = (lo + hi) /2
      if(v(mi) < x) lowerBound(v, x, mi, hi)
      else lowerBound(v, x, lo, mi)
    }

    // TODO 스칼라 immutable vector 의 시간복잡도 시간날때 점검. updated가 eC인 이유
    nums.foldLeft(Vector[Int](Int.MinValue))((v, x) => {
      if(x > v.last) v :+ x
      else v.updated(lowerBound(v, x, 0, v.length), x)
    }).length - 1
  }
  def main(args: Array[String]): Unit = {
    println(lengthOfLIS(Array(10,9,2,5,3,7,101,18)))
    println(lengthOfLIS(Array(2,5,3,4)))
  }
}
