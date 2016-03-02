package sml

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
class Translator(fileName: String) {
  private final val PACKAGE = "sml."

  // word + line is the part of the current line that's not yet processed
  // word has no whitespace
  // If word and line are not empty, line begins with whitespace

  /**
    * translate the small program in the file into lab (the labels) and prog (the program)
    */
  def readAndTranslate(m: Machine): Machine = {
    val labels = m.labels
    var program = m.prog
    import scala.io.Source
    val lines = Source.fromFile(fileName).getLines
    for (line <- lines) {
      val fields = line.split(" ")
      if (fields.length > 0) {
        labels.add(fields(0))


        val instructionClass = Class.forName(PACKAGE + fields(1).capitalize + "Instruction")
        val constructors = instructionClass.getConstructors
        val dependencies = getDependencies(constructors(0).getParameterTypes, fields)

        dependencies.length match {
          case 2 =>
            program = program :+ constructors(0).newInstance(
              dependencies(0), dependencies(1)).asInstanceOf[Instruction]
          case 3 =>
            program = program :+ constructors(0).newInstance(
              dependencies(0), dependencies(1), dependencies(2)).asInstanceOf[Instruction]
          case 4 =>
            program = program :+ constructors(0).newInstance(
              dependencies(0), dependencies(1), dependencies(2), dependencies(3)).asInstanceOf[Instruction]
          case 5 =>
            program = program :+ constructors(0).newInstance(
              dependencies(0), dependencies(1), dependencies(2), dependencies(3), dependencies(4)).asInstanceOf[Instruction]
          case x =>
            println("Unknown Instruction " + fields(1))
        }
      }
    }
    new Machine(labels, program)
  }

  private def getDependencies(paramTypes: Array[Class[_]], fields: Array[String]): Array[Object] = {

    val size = fields.length
    val result : Array[Any] = new Array(size)
    for(i <- 0 until size) {

      if(paramTypes(i) == classOf[Int]) {
        val value : Any = fields(i).toInt
        result(i) = value
      } else {
        result(i) = fields(i)
      }
    }
    result.asInstanceOf[Array[Object]]
  }
}

object Translator {
  def apply(file: String) =
    new Translator(file)
}