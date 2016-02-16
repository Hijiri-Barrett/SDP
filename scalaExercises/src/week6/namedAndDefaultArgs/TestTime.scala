package week6.namedAndDefaultArgs

import atomic.AtomicTest._

/**
  * Created by Hijiri on 16/02/2016.
  */
object TestTime extends App {

  val t = new SimpleTime(hours=5, minutes=30)
  t.hr is 5
  t.min is 30
}
