
// O(n) 함수형으로 풀려면 어떻게 해야할까
// 객체를 아예 또 하나 만들어서 전역변수 화 하는걸해야하나
object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    if(s.length == 0) return 0
    val strSet = collection.mutable.Set[Char]()

    var i = 0
    var j = 0
    var ans = 0
    while(i < s.length && j < s.length) {
      if(strSet.contains(s(j))) {
        strSet.remove(s(i))
        i += 1
      } else {
        strSet += s(j)
        j += 1
        ans = Math.max(ans, j-i)
      }
    }
    return ans
  }
}

Solution.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~")