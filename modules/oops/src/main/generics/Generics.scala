package src.main.generics

object Generics extends App {

  // Generic Class [A] is a Generic Type
  class MyList[A] {
    //
  }
  val obj1 = new MyList[Int]
  val obj2 = new MyList[String]

  // Generic Methods
  object Mylist {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = Mylist.empty[Int]
  val emptyListOfString = Mylist.empty[String]

}
