

// O(n^2)
object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for(i <- 0 until nums.length) {
      for(j <- i+1 until nums.length) {
        if(nums(i) + nums(j) == target)
          return Array(i,j)
      }
    }
    Array(0,0)
  }
}


Solution.twoSum(Array(1,3,5,2), 7)
Solution.twoSum(Array(1,3,5,2), 7)



// O(n) with mutable map
object Solution2 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    val numMap = collection.mutable.Map[Int,Int]()
    for(i <- 0 until nums.length)
      numMap += (nums(i) -> i)

    for(i <- 0 until nums.length)
      if(numMap.contains(target-nums(i)) && numMap(target-nums(i)) != i)
        return Array(i, numMap(target-nums(i)))
    Array(0,0)
  }
}

Solution2.twoSum(Array(1,3,5,2), 7)


// O(n) with immutable map

object Solution3 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    Array(0,0)
  }
}

Solution3.twoSum(Array(1,3,5,2), 7)


