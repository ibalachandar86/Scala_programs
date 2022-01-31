package src.main.collections

object Filter extends App {
  val x = Seq(1,2,3,4,5)
  val y = x.filter(x => (x != 2))
  println(y)
}
