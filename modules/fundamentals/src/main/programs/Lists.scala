package src.main.programs

object Lists extends App {
  val x = List(1,2,3,4,5)
  println("contains: " + x.contains(1))
  println("exists: " + x.exists(x => {x/2 == 0}))
  println("forall: " + x.forall(x => {x/2 > 0}))

}
