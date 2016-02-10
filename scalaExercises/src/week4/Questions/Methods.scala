package week4.Questions

/**
  * Created by Hijiri on 26/01/2016.
  */
object Methods {
  def main(args: Array[String]): Unit = {
    val a = getSquare(3)
    assert(a == 9)
    val b = getSquare(6)
    assert(b == 36)
    val c = getSquare(5)
    assert(c == 25)

    val t1 = isArg1GreaterThanArg2(4.1, 4.12)
    assert(!t1)
    val t2 = isArg1GreaterThanArg2(2.1, 1.2)
    assert(t2)

    val m1 = manyTimesString("abc", 3)
    assert("abcabcabc" == m1)
    val m2 = manyTimesString("123", 2)
    assert("123123" == m2)
  }

  def getSquare(num: Int): Int = {
    return num*num
  }

  def isArg1GreaterThanArg2(arg1: Double, arg2: Double): Boolean = {
    return arg1 > arg2
  }

  def manyTimesString(str: String, times: Int): String = {
    var result = ""
    for (i <- 1 to times)
      result += str

    return result
  }
}
