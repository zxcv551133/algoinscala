/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  *   var next: ListNode = null
  *   var x: Int = _x
  * }
  */

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x

  override def toString: String = next match {
    case null => x.toString
    case _ => x + " " + next.toString
  }
}

object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    return addTwoNumbers(l1, l2, 0)
  }

  def addTwoNumbers(l1: ListNode, l2:ListNode, up: Int): ListNode = {
    if(l1 == null && l2 == null) {
      if(up == 0) {
        return null
      } else {
        return new ListNode(up)
      }
    }
    if(l1 == null) return addTwoNumbers(new ListNode(0), l2, up)
    if(l2 == null) return addTwoNumbers(l1, new ListNode(0), up)
    val ret = new ListNode((l1.x + l2.x + up)%10)

    ret.next = addTwoNumbers(l1.next, l2.next, (l1.x + l2.x + up)/10)

    return ret
  }
}


val a1= new ListNode(2)
a1.next = new ListNode(4)
a1.next.next = new ListNode(8)

//val a =

val b1 = new ListNode(5)
b1.next = new ListNode(6)
b1.next.next = new ListNode(4)

Solution.addTwoNumbers(a1,b1)

val a2 = new ListNode(1)
val b2 = new ListNode(9)
b2.next = new ListNode(9)

Solution.addTwoNumbers(a2,b2)