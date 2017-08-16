

trait Function {
 def operator(x: Int, total:Int): Int
}

def perform (xs:List[Int], op: Function, seed: Int):Int = {
  val it = xs.iterator
  var total = seed
  while(it.hasNext)
  {
    total= op.operator(total , it.next())
  }
  total
}

def sum(xs:List[Int]): Int = {
  perform(xs, (total, value) => total + value, 0)
}

def product (xs:List[Int]): Int = {
  perform(xs, (total, value) => total * value, 1)
}


sum(List(1,2,3,4))
product(List(1,2,3,4))
