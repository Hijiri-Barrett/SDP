package week6.namedAndDefaultArgs.p5

/**
  * Created by Hijiri on 16/02/2016.
  */
class Item (name:String, price:Double){

  def cost(grocery:Boolean = false, medication:Boolean = false, rate:Double = 0.10): Double = {
    if(!grocery && !medication) {
      return price * (1+rate)
    }
    else { price }
  }
}
