package week2

/*
 * Operator overloading can be done using scala as shown below
 * Where + is overloaded to sum up the salary
 * 
 * CAUTION: You should be wise in using operator overloading 
 * 
 */
case class Employee(salary:Int) {
  def +(that:Int):Employee = {
    return new Employee(salary = this.salary + that)
  }
  def +(that:Employee):Employee = {
    return new Employee(salary = this.salary + that.salary)
  }
}

object OperatorOverloading {
  def main(args:Array[String]): Unit = {
    val emp1 = new Employee(1000)
    val emp2 = new Employee(3000)
    val sumEmp = emp1 + emp2
    println(sumEmp.salary)
  }
}