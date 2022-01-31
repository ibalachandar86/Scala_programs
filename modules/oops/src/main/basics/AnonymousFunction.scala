package src.main.basics

// A function which does not contain a name is known as an anonymous function
object AnonymousFunction extends App {
  val x = List(1,2,3,4,5)
  val y = x.map(x => x * 2)
  println(y)
  val z = y.map(_*2)
  println(z)
}
