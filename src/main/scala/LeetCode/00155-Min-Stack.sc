class MinStack() {

  /** initialize your data structure here. */
  val pq = collection.mutable.PriorityQueue[Int]()(Ordering[Int].reverse)
  val st = collection.mutable.Stack[Int]()
  val mm = collection.mutable.Map[Int, Int]()

  def push(x: Int) {
    pq += x
    st.push(x)
    mm.get(x) match {
      case None => mm.put(x,1)
      case Some(p) => mm(x) = p + 1
    }
  }

  def pop() {
    mm(st.head) = mm(st.head) -1
    if(st.pop() == pq.head) {
      pq.dequeue()
      while(!pq.isEmpty && mm.contains(pq.head) && mm(pq.head) == 0) {
        pq.dequeue()
      }
    }
  }

  def top(): Int = {
    st.head
  }

  def getMin(): Int = {
    pq.head
  }
}
//
//val mst = new MinStack()
//
//  /*
//  ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
//  [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
//  */
//
//mst.push(-2147483648)
//mst.top()
//mst.push(4)
//mst.getMin()
////
//mst.push(2147483646)
//mst.push(2147483646)
//mst.push(2147483647)
//mst.top()
//mst.pop()
//mst.getMin()
//mst.pop()
//mst.getMin()
//mst.pop()
//mst.push(2147483647)
//mst.top()
//mst.getMin()
//mst.push(-2147483648)
//mst.top()
//mst.getMin()
//mst.pop()
//mst.getMin()


