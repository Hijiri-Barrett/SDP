package sml

/**
  * Created by Hijiri on 24/02/2016.
  */
class BnzInstruction (label: String, op: String, val r: Int, label2: String)
  extends Instruction (label, op) {

  override def execute(m: Machine) {

    if(m.regs(r)==0) {
      val labels = m.labels.labels
      for (i <- 0 until labels.size) {
        if (labels(i) == label2) {
          m.prog(i).execute(m)
          return
        }
      }
    }
    else { return }

    println(label2 + " does not exist.")
  }

  override def toString(): String = {
    super.toString + " if " + r + " == 0 -> run " + label2 + "\n"
  }
}

object BnzInstruction {
  def apply(label1: String, r: Int, label2: String) =
    new BnzInstruction(label1, "bnz", r, label2)
}
