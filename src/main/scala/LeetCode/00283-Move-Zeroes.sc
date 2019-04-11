object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
      if(nums.length == 0) return
      var l = 0
      var r = 0

      while(l < nums.length && nums(l) != 0) {
        l += 1
        r += 1
      }
      while(r < nums.length && nums(r) == 0) {
        r += 1
      }
      while(r < nums.length) {
        println(l,r, nums(l), nums(r))
        nums(l) = nums(r)
        nums(r) = 0
        r += 1
        l += 1

        while(l < nums.length && nums(l) != 0) {
          r += 1
          l += 1
        }
        while(r < nums.length && nums(r) == 0) {
          r += 1
        }
      }
    }
}



val ar = Array(0,1,2,3,0,4,5,0,0)
Solution.moveZeroes(ar)
ar

val ar2 = Array(1,0,1,0)
Solution.moveZeroes(ar2)
ar2