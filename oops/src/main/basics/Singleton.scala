package src.main.basics

// The object is a singleton instance, how many instance we create all ll be equal.

object Singleton extends App {

  class singleton_c {
    //
  }

  object singleton_o {
   //
  }

  val obj1 = new singleton_c
  val obj2 = new singleton_c
  println(obj1 == obj2) // False since class is not a singleton object

  val obj3 = singleton_o
  val obj4 = singleton_o
  println(obj3 == obj4) // True since object is a singleton object

}
