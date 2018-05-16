package week1

import week1.Macros._

object MacroTester {
  def main(args: Array[String]): Unit = {
     // here debug get replaced with the macro expansion in compile time
     debug("Chakri")
  }
}