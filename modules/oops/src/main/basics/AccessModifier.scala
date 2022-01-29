package src.main.basics

object AccessModifier extends App {

  class vehicle {
    def x = println("Public access modifier")
    protected def y = println("Protected access modifier")
    private def z = println("Private access modifier")
    println(z) // Private can only be accessed with in the super class not outside
  }

  class car extends vehicle {
    def y1 = y // Protected can only be accessed with in the super + child class not outside
  }

  val obj = new car
  obj.x // Public class can be accessed outside super + child classes
  obj.y1 // Protected class can be accessed via child class
  // obj.y // Compilation Error
  // obj.z // Compilation Error
}
