package week4.Questions

/**
  * Created by Hijiri on 26/01/2016.
  */
object ClassAndObject {
  def main(args: Array[String]): Unit = {

    question1()
    question2()
  }

  def question1(): Unit = {
    val r1 = 0 until 10
    println(r1.toString)
    println("r1 step = " + r1.step)
    val r2 = 0 until 10 by 2
    println(r2.toString)
    println("r2 step = " + r2.step)
  }

  def question2(): Unit = {
    var s1 = "Sally"
    var s2 = "Sally"

    if(s1.equals(s2)) {
      println("s1 == s2")
    } else {
      println("s1 != s2")
    }
  }
}
