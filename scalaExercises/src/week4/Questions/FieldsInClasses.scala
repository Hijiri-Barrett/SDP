package week4.Questions

/**
  * Created by Hijiri on 26/01/2016.
  */
object FieldsInClasses {
  class Cup {
    private var percentFull = 0
    private val max = 100
    private val min = 0
    def add(increase:Int):Int = {
      percentFull += increase
      if(percentFull > max) {
        percentFull = max
      }
      if(percentFull < min) {
        percentFull = min
      }
      percentFull // Return this value
    }
    def set(i: Int): Unit = {
      percentFull = i
    }
    def get(): Int = {
      return percentFull
    }
  }

  def main(args: Array[String]): Unit = {

    //question1()
    question2()
    question3()
    question4()
  }

  def question1(): Unit = {
    val cup = new Cup()
    assert(cup.add(45) == 45)
    assert(cup.add(-15) == 30)
    assert(cup.add(-50) == -20)
  }

  def question2(): Unit = {
    val cup = new Cup()
    assert(cup.add(45) == 45)
    assert(cup.add(-55) == 0)
    assert(cup.add(10) == 10)
    assert(cup.add(-9) == 1)
    assert(cup.add(-2) == 0)
  }

  def question3(): Unit = {
    val cup = new Cup()
    //cup.percentFull = 20
    //assert(cup.percentFull == 20)
  }

  def question4(): Unit = {
    val cup = new Cup()
    cup.set(56)
    assert(cup.get() == 56)
  }
}
