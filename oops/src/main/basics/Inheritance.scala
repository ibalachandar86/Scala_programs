package src.main.basics

object Inheritance extends App {

  // Single class inheritance - child class car extends vehicle super class
  class vehicle {
    val color: String = "abc"

    def x = println("In vehical class")

    def y = println("Super Method")
  }

  // Override method
  class car extends vehicle {
    override val color = "blue"

    override def x = println("In car class: ")

    def printSuperMethod = y
  }

  val obj1 = new car
  obj1.x
  println(obj1.color)
  obj1.printSuperMethod

  // Inheritance with Parameters and Constructors
  class vehicle_1(val name: String, val model: String) {
    def this(name: String) = this(name, model = "XXX")
  }

  class car_1(name: String, model: String) extends vehicle_1(name, model)

  class car_2(name: String) extends vehicle_1(name)

  var obj2 = new car_1("ford", "1")
  var obj3 = new car_2("kia")
  println(obj2.name + "," + obj2.model)
  println(obj3.name + "," + obj3.model)

  // Restrict Overrides using final keyword can use sealed also but seal will restrict only outside override access
  // Restrict method override
  class vehicle_2 {
    val x = "abc"

    def y = println("Print x from function y: " + x)

    final def z = println("Print x from function z: " + x)
  }

  class car_3 extends vehicle_2 {
    override def y = println("Overided print x from function y: " + x) //Success
    //override def z = println("Overided print x from function z: " + x) //Compile Error not allowed to override
  }

  // Restrict class override
  final class vehicle_3 {
    val x = "abc"

    def y = println("Print x from function y: " + x)
  }
  //class car_4 extends vehicle_3 //Compile Error not allowed to override class itself

}
