package src.main.basics

object Anonymous extends App {

  // Abstract class cannot be instantiated need a sub class to extend it.
  abstract class Animal {
    def eat: Unit
  }

  //But when you try to create a object for a abstract class, JVM will create a intermediate Anonymous class
  val obj1 = new Animal {
    override def eat: Unit = println("Created Obj for Abstract class")
  }
  println(obj1.getClass) // Output - class src.main.basics.Anonymous$$anon$1
  // JVM created a Anonymous class src.main.basics.Anonymous$$anon$1 like below
  /*class Anonymous$$anon$1 extends Animal {
    override def eat: Unit = println("Created Obj for Abstract class")
  }*/


}
