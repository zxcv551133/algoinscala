object Solution {
  def subsets(nums: Array[Int]): List[List[Int]] = {
    var ret:List[List[Int]] = Nil
    def makeSubSets(i:Int, v:List[Int]):Unit = {
      if(i==nums.length) ret = v::ret
      else {
        makeSubSets(i+1, nums(i)::v)
        makeSubSets(i+1, v)
      }
    }
    makeSubSets(0, Nil)
    ret
  }
}
Solution.subsets(Array(1,2,3))


