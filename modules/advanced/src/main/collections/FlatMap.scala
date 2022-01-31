package src.main.collections

// Flattening the elements of Collection after applying map function
object FlatMap extends App {
  val x = Seq("abc","def","ghi")
  val y = x.map(_.toLowerCase())
  println("y: " + y)
  val z = x.flatMap(_.toLowerCase())
  println("z: " + z)
}
