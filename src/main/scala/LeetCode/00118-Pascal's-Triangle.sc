object Solution {
  def generate(numRows: Int): List[List[Int]] = {
    if(numRows == 0) return Nil
    def makePascal(i: Int, current: List[List[Int]]): List[List[Int]] = {
      if(i == numRows) current
      else makePascal(i+1, current.head.foldLeft(0 :: List[Int]())((x,y) => y :: y + x.head :: x.tail)::current)
    }
    makePascal(1, List(List(1))).reverse
  }
}
Solution.generate(5)
