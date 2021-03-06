package week7.traitsAndInheritance

/**
  * Created by Hijiri on 20/02/2016.
  */

sealed trait Shape {

  def sides : Int
  def perimeter : Double
  def area : Double
}

class Circle (val radius:Double) extends Shape {

  override def sides: Int = 1

  override def perimeter: Double = 2*radius*math.Pi

  override def area: Double = math.Pi * radius * radius
}

abstract class Rectangular (val length:Double, val height:Double) extends Shape {

  override def sides: Int = 4

  override def perimeter: Double = 2*length + 2*height

  override def area: Double = length*height
}

class Rectangle (length:Double, height:Double) extends Rectangular (length, height)

class Square (length:Double) extends Rectangular (length, length)
