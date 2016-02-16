package week6.namedAndDefaultArgs.p3and4

import atomic.AtomicTest._
/**
  * Created by Hijiri on 16/02/2016.
  */
object TestPlanet extends App {

  val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
  p.hasMoon is false

  val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
  earth.hasMoon is true
}
