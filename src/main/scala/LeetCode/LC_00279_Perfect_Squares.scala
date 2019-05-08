package LeetCode

import scala.annotation.tailrec


object LC_00279_Perfect_Squares {




  // TODO: 더 빠르게 변경
  def numSquares(n: Int): Int = {


//    // TODO memoize 다른 방법 활용하는 법
//    def memoization[A, B](func: A => B) = new (A => B){
//      val cache = scala.collection.mutable.Map[A, B]()
//      def apply(x: A): B = cache.getOrElseUpdate(x, func(x))
//    }

//  lazy val pp: Int => Int = memoization {
//    case 0 => 0
//    case x: Int => Range(math.sqrt(x).toInt, 1, -1).foldLeft(x)((a , b) => math.min(pp(x - b * b) + 1, a))
//  }
//    pp(n)



    def memoize[I, O](f: I => O): I => O = new scala.collection.mutable.HashMap[I, O]() {
      override def apply(key: I): O = getOrElseUpdate(key, f(key))
    }

    lazy val numSq: Int => Int = memoize {
      case 0 => 0
      case x => Range(math.sqrt(x).toInt, 1, -1).foldLeft(x)((a, b) => math.min(numSq(x - b * b) + 1, a))
      // you will see "Stack Over Flow" if you implement case expression as
      // case x => (1 to math.sqrt(x).toInt).foldLeft(x)((a , b) => math.min(numSq(x - b * b) + 1, a))
      // if you want to use this, then you should add "(1 to n).foreach(numSq)" before numSq(n).
    }
    numSq(n)

  }

  def main(args: Array[String]): Unit = {
    println(numSquares(1))
    println(numSquares(13))
    println(numSquares(12))
    println(numSquares(16))
    println(numSquares(1000))
  }

}
