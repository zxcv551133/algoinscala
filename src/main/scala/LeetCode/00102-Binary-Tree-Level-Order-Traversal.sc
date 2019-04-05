/**
  * Definition for a binary tree node.
  * class TreeNode(var _value: Int) {
  *   var value: Int = _value
  *   var left: TreeNode = null
  *   var right: TreeNode = null
  * }
  */

class TreeNode(val _value:Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
object Solution {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    if(root == null) return Nil
    val q = collection.mutable.Queue[TreeNode]()
    q.enqueue(root)

    var post = 0
    var current = 1
    var ret = List[List[Int]]()

    while(!q.isEmpty) {
      var x = List[Int]()
      while(!q.isEmpty && current != 0) {
        val t = q.head
        q.dequeue() //

        (t.left, t.right) match {
          case (null, null) => ;
          case (null, r) => {
            q.enqueue(r)
            post += 1
          }
          case (l, null) => {
            q.enqueue(l)
            post += 1
          }
          case (l, r) => {
            q.enqueue(l)
            q.enqueue(r)
            post += 2
          }
        }
        x = t.value :: x
        current -= 1
      }
      current = post
      post = 0
      ret = x.reverse :: ret
    }
    ret.reverse
  }
}


val q = collection.mutable.Queue[Int]()

q.enqueue(1)
q.head
q.enqueue(2)
q.head
q.dequeue()
q.head

//[3,9,20,null,null,15,7],