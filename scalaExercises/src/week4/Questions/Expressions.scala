package week4.Questions

import scala.io.StdIn.readLine

/**
  * Created by Hijiri on 26/01/2016.
  */
object Expressions {
  def main (args: Array[String]): Unit = {

    println(Question1)
    println(Question2)
    println(Question3)
    println(Question4(100))
    println(Question5(100))
  }

  def Question1(): Boolean = {
    println("Question 1")
    val sky = readLine("Weather: ")
    val temp = readLine("Temperature: ").toInt

    return sky == "sunny" && temp > 80
  }

  def Question2(): Boolean = {
    println("Question 2")
    val sky = readLine("Weather: ")
    val temp = readLine("Temperature: ").toInt

    return (sky == "sunny" || sky == "partly cloudy") && temp > 80
  }

  def Question3(): Boolean = {
    println("Question 3")
    val sky = readLine("Weather: ")
    val temp = readLine("Temperature: ").toInt

    return (sky == "sunny" || sky == "partly cloudy") && (temp > 80 || temp < 20)
  }

  def Question4(fah: Float): Float = {

    var result = fah - 32
    result *= (5.0f/9.0f)

    return result
  }

  def Question5(cel: Float): Float = {

    var result = cel * (9.0f/5.0f)
    result += 32

    return result
  }
}
