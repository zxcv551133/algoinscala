package LeetCode

object LC_00287_Find_the_Duplicate_Number {
  def findDuplicate(nums: Array[Int]): Int = {
    def FloydCycleDetect(fpt: Int, spt: Int): Int = {
      if(fpt == spt) spt
      else FloydCycleDetect(nums(nums(fpt)), nums(spt))
    }
    def getCycleStartPosValue(fpt: Int, spt: Int): Int = {
      if(fpt == spt) spt
      else getCycleStartPosValue(nums(fpt), nums(spt))
    }
    getCycleStartPosValue(FloydCycleDetect(nums(nums(nums(0))), nums(nums(0))), nums(0))
  }

  def main(args: Array[String]): Unit = {
    println(findDuplicate(Array(5,2,1,4,3,3)))
    println(findDuplicate(Array(3,1,3,4,2)))
  }
}