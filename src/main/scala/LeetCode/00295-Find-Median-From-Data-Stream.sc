class MedianFinder() {

  /** initialize your data structure here. */
  val maxHeap = collection.mutable.PriorityQueue[Int](Int.MinValue)
  val minHeap = collection.mutable.PriorityQueue[Int](Int.MaxValue)(Ordering[Int].reverse)

  def addNum(num: Int) {
    maxHeap.enqueue(num)
    minHeap.enqueue(maxHeap.dequeue())
    if(maxHeap.size < minHeap.size)
      maxHeap.enqueue(minHeap.dequeue())
  }

  def findMedian(): Double = {
    if(minHeap.size == maxHeap.size) (minHeap.head + maxHeap.head) / 2.0
    else maxHeap.head
  }
}

val pp = new MedianFinder

pp.addNum(1)
pp.addNum(2)
pp.findMedian()

/**
  * Your MedianFinder object will be instantiated and called as such:
  * var obj = new MedianFinder()
  * obj.addNum(num)
  * var param_2 = obj.findMedian()
  */