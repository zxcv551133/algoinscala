// 미해결

object Solution {
  def generateParenthesis(n: Int): List[String] = {
    if(n == 0) Nil
    else if(n==1)
      "()"::List()
    else {

      for(i <- 0 to n-1) {
        val a = generateParenthesis(i)
        val b = generateParenthesis(n - 1 - i)

      }
      val temp = generateParenthesis(n-1)
      (temp.map(s => "(" + s + ")") ::: temp.map(s => "()" + s) ::: temp.map(s => s + "()")).toSet.toList
    }
  }
}

Solution.generateParenthesis(3).toSet.toList