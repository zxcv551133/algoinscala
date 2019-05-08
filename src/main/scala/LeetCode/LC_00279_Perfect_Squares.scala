package LeetCode

import scala.annotation.tailrec


object LC_00279_Perfect_Squares {



//  def memoize[A, B](func: A => B) = new (A => B){
//    val cache = scala.collection.mutable.Map[A, B]()
//    def apply(x: A): B = cache.getOrElseUpdate(x, func(x))
//  }



//  lazy val fib: Int => BigInt = memoize {
//    case 0 => 0
//    case 1 => 1
//    case n => fib(n-1) + fib(n-2)
//  }


//  lazy val c: ((Int, Int)) => BigInt = memoize {
//    case (_, 0) => 1
//    case (n, r) if r > n/2 => c(n, n - r)
//    case (n, r) => c(n - 1, r - 1) + c(n - 1, r)
//  }
//  def memoization[I, O](f: I => O): I => O = new scala.collection.mutable.HashMap[I, O]() {
//    override def apply(key: I): O = getOrElseUpdate(key, f(key))
//  }

  // TODO: 더 빠르게 변경
  def numSquares(n: Int): Int = {
    def memoize[I, O](f: I => O): I => O = new scala.collection.mutable.HashMap[I, O]() {
      override def apply(key: I): O = getOrElseUpdate(key, f(key))
    }
//    val dp = collection.mutable.Map[Int, Int]()
//    dp.put(0, 0)

    lazy val numSq: Int => Int = memoize {
      case 0 => 0
      case x => (1 to math.sqrt(x).toInt).foldLeft(x)((a , b) => math.min(numSq(x - b * b) + 1, a))
    }

//    println(fib(300))
    (1 to n).foreach(numSq)

    //    Range(1, n, 100).foreach(numSq)

    numSq(n)

//
//    def buildDp(x: Int): Unit = {
//      (1 to x).filter(v => v * v <= x).foreach(y => dp.put(x, math.min(dp.getOrElse(x, x), 1 + dp(x - y * y))))
//    }
//    (1 to n).foreach(buildDp)
//    dp(n)
  }

  def main(args: Array[String]): Unit = {
    println(numSquares(1))
    println(numSquares(13))
    println(numSquares(12))
    println(numSquares(16))
    println(numSquares(1000))
  }

}
