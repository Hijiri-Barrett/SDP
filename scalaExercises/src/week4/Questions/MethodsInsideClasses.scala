package week4.Questions

/**
  * Created by Hijiri on 26/01/2016.
  */
object MethodsInsideClasses {

  class Sailboat {
    def raise(): String = {
      return "Sails raised"
    }
    def lower(): String = {
      return "Sails lowered"
    }
    def signal(): String = {
      val flare = new Flare()
      return flare.light()
    }
  }
  class Motorboat {
    def on(): String = {
      return "Motor on"
    }
    def off(): String = {
      return "Motor off"
    }
    def signal(): String = {
      val flare = new Flare()
      return flare.light()
    }
  }
  class Flare {
    def light(): String = {
      return "Flare used!"
    }
  }

  def main(args: Array[String]): Unit = {
    question1()
    question2()
    question3()
  }

  def question1(): Unit = {
    val sailboat = new Sailboat()
    assert(sailboat.raise() == "Sails raised")
    assert(sailboat.lower() == "Sails lowered")

    val motorboat = new Motorboat()
    assert(motorboat.on() == "Motor on")
    assert(motorboat.off() == "Motor off")
  }

  def question2(): Unit = {
    val flare = new Flare()
    assert(flare.light() == "Flare used!")
  }

  def question3(): Unit = {
    val sailboat = new Sailboat()
    assert(sailboat.signal() == "Flare used!")

    val motorboat = new Motorboat()
    assert(motorboat.signal() == "Flare used!")
  }
}
