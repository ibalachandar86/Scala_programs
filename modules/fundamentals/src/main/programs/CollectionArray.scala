package src.main.programs

import com.sun.org.apache.xpath.internal.functions.FuncConcat

import scala.+:

// Array is mutable collection
// Array is a fixed size data structure that stores elements of the same data type.
// The index of the first element of an array is zero and the last element is the total number of elements minus one.
import Array._

object CollectionArray extends App {

  var a = Array(1,2,3,4,5)
  var b = Array(6,7,8,9,10)
  var c = concat(a, b)
  println(a.length)  // Length of Array
  println(a(0))      // First element of Array
  println(a(4))      // Last element of Array
  a(4) = 6           // Update values of Array
  for (n <- a) { println(n) }   // Print all elements of Array

  // Prepend and Append Elements to a Array
  // :+ Append 1 Item
  // ++ Append n Item
  // +: Prepend 1 Item
  // ++: Prepend n Item

  b = b :+ 11
  for (n <- b) { println("Append 1 Item: " + n) }
  b = b ++ Array(12, 13)
  for (n <- b) { println("Append n Items: " + n) }
  b = 0 +: b
  for (n <- b) { println("Prepend 1 Item: " + n) }
  b = Array(-2, -1) ++: b
  for (n <- b) { println("Prepend n Items: " + n) }

}
