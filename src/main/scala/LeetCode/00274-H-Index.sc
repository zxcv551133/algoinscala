object Solution {
  def hIndex(citations: Array[Int]): Int = {
    val sortedCitations = citations.sortWith(_ > _)

    for(i <- 0 until citations.length) {
      if(i+1 > sortedCitations(i)) return i
    }
    citations.length
  }
}

Solution.hIndex(Array(3,0,6,1,5))