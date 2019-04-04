object Solution {
  def addBinary(a: String, b: String): String = {
    val ret = "0" * (Math.max(a.length, b.length) + 1)
    val ca = "0" * (ret.length - a.length) + a
    val cb = "0" * (ret.length - b.length) + b
    if(ca == "00" && cb == "00") return "0"
    def add(i:Int, v:Int):String = {
      if(i==0) {
        if(v == 0) return ""
        else return "1"
      }
      add(i-1, (ca(i).toInt + cb(i).toInt - '0' - '0' + v)/2) +
        ((ca(i).toInt + cb(i).toInt - '0' - '0' + v)%2).toString
    }
    add(ret.length - 1 , 0)
  }
}

Solution.addBinary("0", "1")
