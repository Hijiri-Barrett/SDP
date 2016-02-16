package week6.namedAndDefaultArgs.p5

import atomic.AtomicTest._

/**
  * Created by Hijiri on 16/02/2016.
  */
object TestItem extends App {

  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4

  val sunscreen = new Item(name="sunscreen", 3)
  sunscreen.cost() is 3.3

  val tv = new Item(name="television", 500)
  tv.cost(rate = 0.06) is 530
}
