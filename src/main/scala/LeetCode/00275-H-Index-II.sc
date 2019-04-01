object Solution {
  def hIndex(citations: Array[Int]): Int = {

    for(i <- Range(citations.length, 0, -1)) {
      if(citations.length - i + 1 > citations(i - 1)) return citations.length - i
    }
    citations.length
  }
}

Solution.hIndex(Array(0,1,3,5,6))