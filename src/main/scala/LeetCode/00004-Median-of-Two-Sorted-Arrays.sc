// O(n)
object Solution {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val totalLength = nums1.length + nums2.length
    var a = 0
    var b = 0
    var med = 0
    var med2 = 0
    while(a + b <= totalLength/2) {
      med2 = med
      if(a == nums1.length) {
        med = nums2(b)
        b += 1
      } else if(b == nums2.length) {
        med = nums1(a)
        a += 1
      } else {
        if(nums1(a) > nums2(b)) {
          med = nums2(b)
          b += 1
        }
        else {
          med = nums1(a)
          a += 1
        }
      }
    }
    if(totalLength % 2 == 1)
      return med
    else {
      return (med + med2)/2.0
    }
  }
}



Solution.findMedianSortedArrays(Array(1,2,3), Array())

Solution.findMedianSortedArrays(Array(1,2,3), Array(1,2,3))

Solution.findMedianSortedArrays(Array(1,2,3), Array(3,4))

Solution.findMedianSortedArrays(Array(1,2), Array(3,4))
