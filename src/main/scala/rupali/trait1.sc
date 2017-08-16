import scala.collection.mutable

trait Operation[S]{
  def operate(x:Int):Int
}

def Perform(xs:List[Int], op : (Int) => Int):List[Int] = {
  val it = xs.iterator
  val buffer = mutable.Buffer.empty[Int]
  while(it.hasNext) {
    buffer+= op.apply(it.next())
  }
  buffer.toList
}

class Square() extends (Int => Int) {
  override def apply(x:Int) = { x * x }
}


def square(xs:List[Int]):List[Int] = {
  val op :(Int => Int) = (x:Int) => x * x
  Perform(xs , op)
}

square(List(1,2,3,4))


