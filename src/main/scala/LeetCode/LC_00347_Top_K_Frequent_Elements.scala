package LeetCode

object LC_00347_Top_K_Frequent_Elements {
  def topKFrequent(nums: Array[Int], k: Int): List[Int] = {
    nums.groupBy(identity).mapValues(_.size).toList.sortWith((x,y) => {
      x._2 > y._2
    }).take(k).map(_._1)
  }
  def main(args: Array[String]): Unit = {
    topKFrequent(Array(1,1,1,3,2,2), 2)
  }
}
