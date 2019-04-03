class Interval(var _start: Int = 0, var _end: Int = 0) {
  var start: Int = _start
  var end: Int = _end

  override def toString: String = (start,end).toString
}
object Solution {
  def merge(intervals: List[Interval]): List[Interval] = {
    if(intervals.isEmpty) return Nil
    val sIntervals = intervals.sortWith(_._start < _._start)
    sIntervals.foldLeft(List(new Interval(sIntervals.head.start,sIntervals.head.start)))( (x, y) => {
      if(x.head.end >= y.start) {
        new Interval(x.head.start, Math.max(y.end, x.head.end)):: x.tail
      } else {
        y :: x
      }
    }).reverse
  }
}

Solution.merge(List(new Interval(0,2),
  new Interval(1,4) ))
