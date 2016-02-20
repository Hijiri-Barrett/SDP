package week7.traitsAndInheritance

import java.awt.Rectangle
import javafx.scene.shape.Circle


/**
  * Created by Hijiri on 20/02/2016.
  */

object Draw {

  def apply(shape:Shape): Unit = {

    val shapeType = shape.getClass

    if(shapeType == classOf[Circle]) {
      val c: Circle = shape.asInstanceOf[Circle]
      println("A circle of radius " + c.radius + "cm")
    }
    if(shapeType == classOf[Rectangle]) {

    }
    if(shapeType == classOf[Square]) {

    }
  }
}

object TestShape extends App {

  val circle = new Circle(10)
  Draw(circle)
}
