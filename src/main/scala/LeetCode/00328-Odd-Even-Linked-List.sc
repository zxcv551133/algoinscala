/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  *   var next: ListNode = null
  *   var x: Int = _x
  * }
  */

// TODO 함수형으로 풀기
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
object Solution {
  def oddEvenList(head: ListNode): ListNode = {
    if(head == null || head.next == null) return head
    val even = head.next
    val ret = head
    var curOdd = head
    var curEven = even
    while(curOdd.next != null && curEven.next != null
    ) {
      curOdd.next = curEven.next
      curOdd = curOdd.next
      curEven.next = curOdd.next
      curEven = curEven.next
    }
    curOdd.next = even
    ret
  }
}