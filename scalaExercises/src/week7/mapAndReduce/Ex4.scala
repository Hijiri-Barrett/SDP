package week7.mapAndReduce

import atomic.AtomicTest._

/**
  * Created by Hijiri on 20/02/2016.
  */
object Ex4 extends App {

  def sumIt(nums : Int*): Int = {
    nums.reduce((sum, n) => sum + n )
  }

  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195
}
