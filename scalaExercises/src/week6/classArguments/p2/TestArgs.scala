package week6.classArguments.p2

import atomic.AtomicTest._

/**
  * Created by Hijiri on 16/02/2016.
  */
object TestArgs extends App {

  val family3 = new FlexibleFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4

  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3
}

