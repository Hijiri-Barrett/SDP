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
  v3.foreach(n => 11 * n + 10) is Vector(21, 32, 43, 54)

  // for each does not return a Vector but instead just runs the
  // function for each element.

  val v4 = Vector(1, 2, 3, 4)
  for(n <- 0 to 3) {
    v4.updated(n, 2*n) //(11 * n + 10)
  }
  v4 is Vector(21, 32, 43, 54)

  //screw vectors
}
