import scala.collection.mutable

def square(xs: List[Int]): List[Int] = {
  val it = xs.iterator
  val buffer = mutable.Buffer.empty[Int]
  while(it.hasNext) {
    val el = it.next()
    buffer += (el * el)
  }
  buffer.toList
}

def increment(xs: List[Int]): List[Int] = {
  val it = xs.iterator
  val buffer = mutable.Buffer.empty[Int]
  while(it.hasNext) {
    val el = it.next()
    buffer += (el + 1)
  }
  buffer.toList
}

increment(List(1,2,3,4))
square(List(1,2,3,4))

