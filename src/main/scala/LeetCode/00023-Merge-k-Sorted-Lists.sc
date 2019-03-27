
/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  *   var next: ListNode = null
  *   var x: Int = _x
  * }
  */

// O(nlogn) 솔루션 함수형 구현

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x

  override def toString: String = next match {
    case null => x.toString
    case _ => x + " " + next.toString
  }
}


// O(kN)
object Solution {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    lists.fold[ListNode](null)(mergeTwoLists(_,_))
  }


  def mergeTwoLists(a: ListNode, b: ListNode): ListNode = {


    if(a == null && b == null)
      null
    else if(a==null)
      b
    else if(b == null)
      a
    else
      if(a.x > b.x) {
        val ret = new ListNode(b.x)
        ret.next = mergeTwoLists(a, b.next)
        ret
      }
      else {
        val ret = new ListNode(a.x)
        ret.next = mergeTwoLists(a.next, b)
        ret

      }
  }
}

val a = new ListNode(1)
a.next = new ListNode(2)
a.next.next = new ListNode(5)



val b = new ListNode(2)
b.next = new ListNode(3)
b.next.next = new ListNode(4)
Solution.mergeKLists(Array(a,b))