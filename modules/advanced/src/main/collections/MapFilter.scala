package src.main.collections

// The filter() method is utilized to select all elements of the map which satisfies a stated predicate
// Method Definition: def filter(p: ((A, B))=> Boolean): Map[A, B]
// Return Type: It returns a new map consisting all the elements of the map which satisfies the given predicate.

object MapFilter extends App {
  val m1 = collection.immutable.Map("geeks" -> 5, "for" -> 3)
  println(m1)
  val result = m1.filter(x => x._1 == "geeks" && x._2 == 5)
  println(result)
}
