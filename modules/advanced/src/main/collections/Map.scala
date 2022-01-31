package src.main.collections

/*
  1) Map function can apply some transformations on collections like Array, List ...
  2) map() is a higher order function.
  3) Every collection object has the map() method.
  4) map() takes some function as a parameter.
  5) map() applies the function to every element of the source collection.
  6) map() returns a new collection of the same type as the source collection.
 */

object Map extends App {
  def square(n: Int): Int = n * n
  val collection = List(1,2,3,4,5)
  val squareCollection = collection.map(square)
  println("squareCollection: " + squareCollection)
  // Using Anonymous Function
  val addBy2Collection = squareCollection.map(x => x +2)
  println("addBy2Collection: " + addBy2Collection)
}
