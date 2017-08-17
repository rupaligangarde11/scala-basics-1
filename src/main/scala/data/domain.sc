//class Person (name: String, age: Int){
//  def isAdault = age > 12
//}
//
//val p = new Person("abc", 55)
//val p2 = new Person("abc", 55)
//p.isAdault
//
//p==p2
//p.hashCode()
//p2.hashCode()
//p eq p2





case class Person (name: String, age: Int){
  def isAdault = age > 12
}

val p = Person("abc", 55)
val p2 = new Person("abc", 55)
p.isAdault

p==p2

p eq p2

p.hashCode()
p2.hashCode()

p.name

new Person("pqr", 23)
p.copy()
p.copy(age = 34)
p.copy(name= "mnl")



object A {
  val PI = 3.14
}

A.PI


sealed trait Day // accessible only in this compilation unit, this file
object Day{
  case object Sunday extends Day
  case object Monday extends Day
}

Day.Sunday: Day.Sunday.type
Day.Sunday: Day


val x = "abc"
x: String
x: x.type


val y = "abc"
y: String
y: y.type
y: x.type 
