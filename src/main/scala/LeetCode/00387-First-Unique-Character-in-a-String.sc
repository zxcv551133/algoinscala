object Solution {
  def firstUniqChar(s: String): Int = {
    val allSet = collection.mutable.Set[Char]()
    val retSet = collection.mutable.Set[Char]()
    for(x <- s) {
      if(allSet(x)) {
        if(retSet(x)) retSet.remove(x)
      } else {
        allSet += x
        retSet += x
      }
    }
    (0 to s.length - 1).foreach(x => if(retSet(s(x))) return x)
    return -1
  }
}

Solution.firstUniqChar("loveleetcode")
Solution.firstUniqChar("leetcode")
Solution.firstUniqChar  ("aabbcc")