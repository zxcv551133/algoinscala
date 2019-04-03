import scala.annotation.tailrec

object Solution {
  def plusOne(digits: Array[Int]): Array[Int] = {
    val ret = new Array[Int](digits.length + 1)
    def plusOneIdx(i:Int, v:Int):Unit = {
      if(i == -1) {
        ret(0) = v
        return
      }
      ret(i + 1) = (digits(i) + v)%10
      plusOneIdx(i-1, (digits(i) + v)/10)
    }
    plusOneIdx(digits.length - 1, 1)
    if(ret(0) == 0) ret.tail
    else ret
  }
}

Solution.plusOne(Array(9,9,9))