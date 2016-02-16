package week6.classArguments.p1

/**
  * Created by Hijiri on 16/02/2016.
  */
class Family (family : String*) {

  def familySize(): Int = { family.length }
}
