package week2

// Scala supports c# style packaging
package hello{
  class User
}

/*
 * Package inside another package is also possible
 */
package animal {
  package birds {
    class Eagle
  }
  package human {
    class Female
    class Male
  }
}

object PackageTest {
  def main(args:Array[String]):Unit = {
    val u = new hello.User
    println(u)
    
    val female = new animal.human.Female
    println(female)
  }
}