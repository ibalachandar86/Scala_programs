package src.main.collections

object Reduce extends App {
  val x = Array(1,2,3,4,5,6)
  val y = x.reduce((x,y) => (x max y))
  println(y)
}
