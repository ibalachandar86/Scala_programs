package src.main.basics

// Create Class and Object with same name is called Companions

// Singleton Instance
object companions {
  // Define Static like variables
  val a = 10
  val b = 20
  def x = println("In Object companion_odj")
}

// Called by Regular Instance
class companions {
  val a = 30
  var b = 0
}

// Complex usage of companion with factory method
object companions_1 {
  // Factory Method
  def apply(x: companions_1): companions_1 =
  {
    println("In Apply Method")
    new companions_1("def")
  }
}
class companions_1(val a: String)

// Main Method
object Companion extends App {

  // The values can be accessed directly because object is Singleton Instance
  println("companions.a in obj: " + companions.a)

  // The values can be accessed only after creating a object for the class
  val obj1 = new companions
  println("companions.a in class: " + obj1.a)

  // Set Value to a companion class from object
  val obj2 = new companions_1("abc")
  companions_1.apply(obj2)

}
