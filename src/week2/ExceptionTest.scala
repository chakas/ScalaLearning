package week2

import scala.util.Try
import scala.util.Success
import scala.util.Failure

object ExceptionTest {
  // exception handling via scala.util.Try
  def newToInt(str:String): Option[Int] = Try(str.toInt) match {
    case Success(value) => Some(value)
    case Failure(_) => None
  }
  // exception handling using old try-catch way
  def toInt(str: String):Integer = {
    try{
      str.toInt
    }catch {
      case exp: Exception => 
        println("WARN: Overriding the usual behavior, returning Zero!") 
        0
    }
  }
  def main(args: Array[String]): Unit = {
    println(toInt("123"))
    /**
     * Handling th exception via try-catch block
     */
    println(toInt("+ 123"))
    println(newToInt("+ 123"))
  }
}