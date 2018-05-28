package week2

/*
 * This class expalins two functionalties of Scala
 * 	1. Implicit class:
 * 		  With implicit class you can extend the funcitonalities of
 * 			primitive data types
 * 				for e.g.,
 * 					Here the boolean is extended to add natural language
 * 					style truth table
 * 	2. One param methods
 * 		 If you are methods accepts only one param 
 * 		 then you can invoke as
 * 				a.invoke(b) => a invoke b
 *			
 */
object OneParamMethods {
  implicit class TruthTable(val b: Boolean) {
    def and(p2: Boolean): Boolean = {
      return b && p2
    }

    def or(p2: Boolean): Boolean = {
      return b || p2
    }
  }
  def main(args: Array[String]): Unit = {
    println(true and false)
    println(false and false)
    println(true and true)
    println(true or false)
  }
}