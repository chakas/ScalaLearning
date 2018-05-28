package basic

case class Employee(name: String,age: Int)

object StrInterpolation {
  /*
   * Basic interpolation to replace the variable value
   */
  def testStrInterpol1(): Unit = {
    println("This is  plain string")
    val name = "Chakri"
    println(s"dynamic name is $name")
  }
  /*
   * when using object we should have ${} notation
   */
  def testStrInterpol2(): Unit = {
    val employee: Employee = Employee(name="Chakri",age=29)
    println(s"dynamic name is ${employee.name}")
  }
  /*
   * Evaluate using interpolation
   */
  def evalInterpolation(): Unit = {
    val employee: Employee = Employee(name="Chakri",age=29)
    println(s"dynamic name is ${employee.age > 18 }")
  }
  /*
   * Using raw
   */
  def rawPrint(): Unit = {
    val name : String = "Chakri";
    println("\nStep 6: Using raw interpolation")
    println(raw"Favorite donut\t$name")
  }
}

object BasicTester {
  def main(args: Array[String]): Unit = {
    StrInterpolation.testStrInterpol1();
    StrInterpolation.testStrInterpol2();
    StrInterpolation.evalInterpolation();
    StrInterpolation.rawPrint();
  }
}