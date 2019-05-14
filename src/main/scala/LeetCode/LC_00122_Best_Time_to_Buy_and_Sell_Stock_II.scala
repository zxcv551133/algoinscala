package LeetCode

object LC_00122_Best_Time_to_Buy_and_Sell_Stock_II {
  def maxProfit(prices: Array[Int]): Int = {
    prices.foldLeft((0,Int.MinValue))((a, b) => {
      (math.max(a._1, a._2 + b), math.max(a._1 - b, a._2))
    })._1
  }
  def main(args: Array[String]): Unit = {
    println(maxProfit(Array(1,4,6,2,7,8)))
  }
}
