package src.main.generics

object Variance extends App {

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // CoVariance List cat extends List Animal
  class CoVariantList[+A]
  val animal: Animal = new Cat
  val animalList: CoVariantList[Animal] = new CoVariantList[Cat]

  // InVariance
  class InVariantList[A]
  val inVariantList: InVariantList[Animal] = new InVariantList[Animal]

  // ContraVariance
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

}
