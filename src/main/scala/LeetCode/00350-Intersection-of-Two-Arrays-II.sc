object Solution {
  def intersect(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {

//    nums1.intersect(nums2) Hacky Way

    val p = nums1.groupBy(identity).mapValues(_.size)
    val t = nums2.groupBy(identity).mapValues(_.size)

    p.flatMap(x => {
      t.get(x._1) match {
        case Some(v) => List.fill(math.min(v, x._2))(x._1)
        case None => Nil
      }
    }).toArray
  }
}






