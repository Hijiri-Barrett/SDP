package week4.Questions

/**
  * Created by Hijiri on 26/01/2016.
  */
object CreatingClasses {
  class Hippo {}
  class Lion {}
  class Tiger {}
  class Monkey {}
  class Giraffe {}

  def main (args: Array[String]): Unit = {
    var hippo = new Hippo()
    var lion = new Lion()
    var tiger = new Tiger()
    var monkey = new Monkey()
    var giraffe = new Giraffe()

    println(hippo)
    println(lion)
    println(tiger)
    println(monkey)
    println(giraffe)

    var lion2 = new Lion()
    var giraffe2 = new Giraffe()
    var giraffe3 = new Giraffe()

    println(lion2)
    println(giraffe2)
    println(giraffe3)
  }
}
