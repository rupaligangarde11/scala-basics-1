
def perform(xs: List[Int], fn:Int => Int): List[Int] = {
  val it = xs.iterator
  var result : List[Int] = List.empty
  while(it.hasNext) {
    result = fn(it.next()) :: result
  }
  result.reverse
}

var test = List(1,2,3,4)

perform(test, x => x * x )
