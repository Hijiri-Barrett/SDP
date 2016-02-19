package week6.paramatisedTypes

import atomic.AtomicTest._

/**
  * Created by Hijiri on 17/02/2016.
  */
object TestParameterisedType extends App {

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char): Vector[Char] = {
    Vector(c1, c2, c3)
  }

  def explicitDouble(d1: Double, d2: Double, d3: Double): Vector[Double] = {
    Vector(d1, d2, d3)
  }

  def explicitList(vec:Vector[Double]): List[Double] = {
    vec.toList
  }

  inferred('a', 'b', 'c') is "Vector(a, b, c)"
  explicit('a', 'b', 'c') is "Vector(a, b, c)"
  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)


}