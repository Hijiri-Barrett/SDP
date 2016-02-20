package week7.mapAndReduce

import atomic.AtomicTest._

/**
  * Created by Hijiri on 20/02/2016.
  */
object Ex1 extends App{

  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)

  val v2 = Vector(1, 2, 3, 4)
  v2.map(n => 11 * n + 10) is Vector(21, 32, 43, 54)

  val v3 = Vector(1, 2, 3, 4)
  v3.foreach(n => 11 * n + 10) is Vector()

  // for each does not return a Vector but instead just runs the
  // function for each element.

  val v4 = Vector(1, 2, 3, 4)
  var l1 = Array[Int]()
  for(n <- v4) {
    l1 = l1 :+ (11 * n + 10)
  }
  val v5 = l1.toVector
  v5 is Vector(21, 32, 43, 54)

  // much more complex
}
