package advanced

object ComplexTest {
  def main(args: Array[String]){
//    val comp = new Complex(1.0,3.0)
//    println(comp.im)
    val double: (Int => Int) = _ * 2
    (1 to 10) foreach double .andThen(println)
    println(double)
  }
}