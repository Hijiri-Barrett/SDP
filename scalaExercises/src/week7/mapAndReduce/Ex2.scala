package week7.mapAndReduce

import atomic.AtomicTest._

/**
  * Created by Hijiri on 20/02/2016.
  */
object Ex2 extends App {

  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)

  val v2 = Vector(1, 2, 3, 4)
  var l1 = Array[Int]()
  for(n <- v2) {
    l1 = l1 :+ (n + 1)
  }
  val v3 = l1.toVector
  v3 is Vector(2, 3, 4, 5)
}
