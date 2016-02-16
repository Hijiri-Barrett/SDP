package week6.namedAndDefaultArgs.p3and4

/**
  * Created by Hijiri on 16/02/2016.
  */
class Planet (name:String, description:String, moons:Int = 1) {

  def hasMoon(): Boolean = { moons > 0 }
}
