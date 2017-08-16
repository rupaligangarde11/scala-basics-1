def map[T, S](xs: List[T])(f: (T)=> S): List[S] = {
  if(xs.isEmpty)
    Nil
  else
    f(xs.head) :: map(xs.tail)(f)
}

var list = List(1,2,3)
map(list)(x=> x*x)

