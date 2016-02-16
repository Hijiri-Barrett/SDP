package week6.classArguments.p3

import atomic.AtomicTest._

/**
  * Created by Hijiri on 16/02/2016.
  */
object TestSquare extends App {

  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21


  def squareThem(numbers : Int*): Int = {

    var result = 0

    for(x <- numbers) {
      result += x*x
    }

    result
  }
}
