package LeetCode

object LC_00454_4Sum_II {

  def fourSumCount(A: Array[Int], B: Array[Int], C: Array[Int], D: Array[Int]): Int = {
    val ab = collection.mutable.Map[Int, Int]()
    val cd = collection.mutable.Map[Int, Int]()
    for(i <- A.indices;
    j <- A.indices) {
      ab += (A(i) + B(j) -> (ab.getOrElse(A(i) + B(j), 0) + 1))
      cd += (C(i) + D(j) -> (cd.getOrElse(C(i) + D(j), 0) + 1))
    }
    ab.foldLeft(0)((cur, x) => {
      cur + cd.getOrElse(-x._1, 0) * x._2
    })

  }

//  TODO 다른 사람 솔루션 이해할것
//  def fourSumCount(A: Array[Int], B: Array[Int], C: Array[Int], D: Array[Int]): Int = {
//    val sumAB = for (a <- A; b <- B) yield (a + b)
//    val sumToCntAB = sumAB.groupBy(r => r).map {
//      case (s: Int, arr: Array[Int]) => (s, arr.size)
//    }.toMap
//    val totalCnt = for (c <- C; d <- D) yield sumToCntAB.get(- c - d).getOrElse(0)
//    return totalCnt.sum
//  }

  def main(args: Array[String]): Unit = {
    println(fourSumCount(Array(1,2), Array(-2,-1), Array(-1,2), Array(0,2)))
  }
}
