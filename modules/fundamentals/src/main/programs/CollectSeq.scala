package src.main.programs

// https://www.geeksforgeeks.org/scala-sequence/
// Sequence is mutable collection
// Iterable
// Indexed Sequence provides fast and random access of elements
// Linear Sequence provides fast access to the first element only via head and also contains a fast tail operation

object CollectSeq extends App {

  val a = Seq(1,2,3,4,5)
  println(a(0))  // First element of Seq
  println(a(4))  // Last element of Seq
  for (n <- a) { println("n: " + n) } // Iterate Seq

}
