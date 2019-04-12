object Solution {
  def fizzBuzz(n: Int): List[String] = {
    for (i <- (1 to n).toList) yield {
      if(i%15 == 0) "FizzBuzz"
      else if(i%3 == 0) "Fizz"
      else if(i%5 == 0) "Buzz"
      else i.toString
    }
  }
}

1
for (i <- (1 to 15).toList) yield {
  if(i%15 == 0) "FizzBuzz"
  else if(i%3 == 0) "Fizz"
  else if(i%5 == 0) "Buzz"
  else i.toString
}