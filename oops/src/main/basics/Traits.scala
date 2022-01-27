package src.main.basics

object Traits extends App {

  // Trait is a abstract class, multiple traits can be inherited
  abstract class vehicle {
    val color: String
    var price: String = "100$"
    def x
  }
  trait model {
    val vehicleType: String
    var insurance_price: String = "200$"
    def y
  }
  // Override method
  class car extends vehicle with model {
    override val color = "blue"
    override def x = println("x ----")
    override val vehicleType = "sedan"
    override def y = println("y ----")
  }
  val obj1 = new car
  obj1.x
  println(obj1.color)
  println(obj1.price)
  obj1.y
  println(obj1.vehicleType)
  println(obj1.insurance_price)

}
