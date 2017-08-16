trait Function {
  def operator(x: Int, total:Int): Int
}

def fold (xs:List[Int], op: Function, seed: Int):Int = {
  val it = xs.iterator
  var total = seed
  while(it.hasNext)
  {
    total= op.operator(total , it.next())
  }
  total
}

def sum(xs:List[Int]): Int = {
  fold(xs, (total, value) => total + value, 0)
}

def map[T, S](xs: List[T])(f: (T)=> S): List[S] = {
  if(xs.isEmpty)
    Nil
  else
    f(xs.head) :: map(xs.tail)(f)
}

sum(List(1,2,3,4))
