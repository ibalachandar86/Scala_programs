// lazy keyword changes the val to get lazily initialized.
// After first initialization the value is cached.
// Lazy initialization means that whenever an object creation seems expensive, the lazy keyword can be stick before val.

package src.main.programs

object LazyVal extends App {

  lazy val a = {
    println("Assigning value to a variable")
    10
  }

  // First time initialization so println in lazy val will be printed
  println("a: " + a)
  // First time initialization so println in lazy val wont be printed, since it is cached
  println("a: " + a)

}
