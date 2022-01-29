package src.main.basics

// Class with no values/values set for the variables, values has to set by the extended class

object Abstract extends App {

  abstract class vehicle {
    val color: String
    var price: String = "100$"
    def x
  }
  class car extends vehicle {
    override val color = "blue"
    override def x = println("Override method")
  }
  val obj1 = new car
  obj1.x
  println(obj1.color)
  println(obj1.price)
}
