implicit val x: Int = 500
def plusValue(paramX: Int)(implicit paramY: Int)= paramX + paramY
plusValue(100)(200)
plusValue(200)
def minusValue(a: Int)(implicit b: Int) = a - b
minusValue(200)