package src.main.generics

object BoundedTypes extends App {

  class Animal
  class Cat extends Animal
  class Dog extends Animal
  class Car

  // Upper Bounded Types [A <: means cage can use the subtypes of super class Animal]
  class CageUpperBound[A <: Animal](animal: A)
  val obj1 = new CageUpperBound(new Dog) // It will Work
  val obj2 = new CageUpperBound(new Cat) // It will Work
  //val obj3 = new CageUpperBound(new Car) // It wont Work because Car class is not a subtype of Animal Class

 // Lower Bounded Types [A >: means cage can use the supertypes of class]
 class CageLowerBound[A >: Cat](cat: A)
 val obj4 = new CageLowerBound(new Animal) // It will work
 //val obj5 = new CageLowerBound(new dog) // It wont work



}
