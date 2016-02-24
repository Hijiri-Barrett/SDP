package sml

/**
  * Created by Hijiri on 24/02/2016.
  */
class BnzInstruction (label: String, op: String, val r: Int, label2: String)
  extends Instruction (label, op) {

  override def execute(m: Machine) {
    val value = m.regs(r)

    if(value==0) {
      for(inst <- m.prog) {
        val method = inst.getClass.getDeclaredField("label")
        val instLabel = method.get(inst).asInstanceOf[String]

        if(instLabel == label2) {
          inst.execute(m)
          return
        }
      }
    }
    println(label2 + " does not exist.")
  }

  override def toString(): String = {
    super.toString + " If " + r + " == 0: run " + label2 + "\n"
  }
}

object BnzInstruction {
  def apply(label1: String, op1: Int, label2: String) =
    new BnzInstruction(label1, "bnz", op1, label2)
}
