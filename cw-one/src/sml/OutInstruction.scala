package sml

/**
  * Created by Hijiri on 23/02/2016.
  */
class OutInstruction (label: String, op: String, val result: Int)
  extends Instruction (label, op) {

  override def execute(m: Machine) {
    println("out: reg " + result + " -> " + m.regs(result))
  }

  override def toString(): String = {
    super.toString + " printing contents of " + result + "\n"
  }
}

object OutInstruction {
  def apply(label: String, result: Int) =
    new OutInstruction(label, "out", result)
}
