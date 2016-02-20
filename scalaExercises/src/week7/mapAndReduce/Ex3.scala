package week7.mapAndReduce

import atomic.AtomicTest._
/**
  * Created by Hijiri on 20/02/2016.
  */
object Ex3 extends App {

  val v = Vector(1, 10, 100, 1000)
  v.reduce((sum, n) => sum + n) is 1111

  val v2 = Vector(1, 10, 100, 1000)
  var sum = 0
  v2.foreach(n => sum = sum + n)
  sum is 1111
}
