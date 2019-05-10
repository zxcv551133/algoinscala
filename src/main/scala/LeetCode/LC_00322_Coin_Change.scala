package LeetCode

object LC_00322_Coin_Change {
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val ret = Array.fill(amount + 1)(Int.MaxValue)

    ret(0) = 0

    (0 to amount).foreach(x => coins.foreach(y => {
      if(y - amount <= - x && ret(x) != Int.MaxValue) ret(x + y) = math.min(ret(x+y), ret(x) + 1)
    }))

    if(ret(amount) == Int.MaxValue) -1 else ret(amount)
  }
  def main(args: Array[String]): Unit = {
//    println(coinChange(Array(1,2,5), 11))
    println(coinChange(Array(2), 3))
  }
}

//Input: coins = [1, 2, 5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1