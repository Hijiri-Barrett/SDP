package sml

/**
  * Created by Hijiri on 24/02/2016.
  */
class BnzInstruction (label: String, op: String, val r: Int, label2: String)
  extends Instruction (label, op) {

  override def execute(m: Machine) {

    if(m.regs(r)==0) {
      import scala.reflect.runtime.{universe => ru}
      val mirror = ru.runtimeMirror(classOf[Instruction].getClassLoader)

      for(instruction <- m.prog) {
        val labelTermSymb = ru.typeOf[Instruction].decl(ru.TermName("label")).asTerm
        val im = mirror.reflect(instruction)
        val labelMirror = im.reflectField(labelTermSymb)

        if(labelMirror.get == label2) {
          instruction.execute(m)
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
