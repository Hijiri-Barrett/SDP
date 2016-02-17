package week6.constructors

/**
  * Created by Hijiri on 17/02/2016.
  */
class Tea (name:String = "Earl Grey", decaf:Boolean = false, milk:Boolean = false, sugar:Boolean = false){

  def describe(): String = {

    var append = ""
    if(decaf) { append += " decaf" }
    if(milk) { append += " + milk" }
    if(sugar) { append += " + sugar" }

    name + append
  }

  def calories(): Int = {

    var cal = 0
    if(milk) { cal += 100 }
    if(sugar) { cal += 16 }

    cal
  }
}
