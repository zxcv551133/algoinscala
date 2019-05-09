val ar = Array(1,2,3,4,5)
val li = List(1,2,3,4,5)

val go: (Int, Int) => Int = {
  case (x, y) => println(x + " " +  y); x + y
}

ar.foldLeft(0)(go)
ar.fold(0)(go)
ar.foldRight(0)(go)
ar.fold(0)(go)


li.foldLeft(0)(go)
li.fold(0)(go)