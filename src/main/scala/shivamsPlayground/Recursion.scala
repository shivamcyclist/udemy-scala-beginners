package shivamsPlayground

import scala.annotation.tailrec

object Recursion extends App {

  //Learning about recursion in scala

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  println(factorial(4)) // prints upto factorial of 16, then after 16, on 17 it goes to a negative result??? need to check on that

  // @tailrec use this annotation and the concept whenever you need loops, and you don't want to get a stackoverflow error.


}
