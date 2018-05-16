package advanced

import java.lang.Math._

object HelloWorld {
  
  def onePerSecond(callback:() => Unit){
      while(true){
        callback()
        Thread sleep 1000
      }
  }
  
  def printMe(){
    println("print me ")
  }
  
  def main(args: Array[String]){
     onePerSecond { () => println("test") }
  }
}