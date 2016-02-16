package week6.namedAndDefaultArgs.p1and2

import atomic.AtomicTest._

/**
  * Created by Hijiri on 16/02/2016.
  */
object TestTime extends App {

  val t = new SimpleTime(hours=5, minutes=30)
  t.hr is 5
  t.min is 30

  val t2 = new SimpleTime(hours=10)
  t2.hr is 10
  t2.min is 0

}
