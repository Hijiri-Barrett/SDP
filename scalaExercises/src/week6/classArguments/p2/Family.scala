package week6.classArguments.p2

/**
  * Created by Hijiri on 16/02/2016.
  */
class FlexibleFamily(parent1 : String, parent2 : String, children : String*) {

  def familySize(): Int = { 2 + children.length }
}
