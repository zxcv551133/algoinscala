package LeetCode

object LC_00121_Best_Time_to_Buy_and_Sell_Stock {
  def maxProfit(prices: Array[Int]): Int = {
    prices.foldLeft((Int.MaxValue,0))((a, b) => {
      (math.min(a._1, b), math.max(a._2, b - a._1))
    })._2
  }
  def main(args: Array[String]): Unit = {
    println(maxProfit(Array(1,4,6,2,7,8)))
  }
}
