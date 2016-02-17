package week6.caseClasses

import atomic.AtomicTest._

/**
  * Created by Hijiri on 17/02/2016.
  */

case class Person (first:String, last:String, email:String)

object TestPerson extends App {

  val p = Person("Jane", "Smile", "jane@smile.com")
  p.first is "Jane"
  p.last is "Smile"
  p.email is "jane@smile.com"
}
