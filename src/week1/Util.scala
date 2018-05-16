package week1

abstract class Vehicle
case class Car() extends Vehicle
case class Motorcycle() extends Vehicle
case class ParkingInvariant[A](value: A)
case class ParkingCovariant[+A](value: A)
case class ParkingContravariant[-A]()

object Util {
  def main(args: Array[String]): Unit = {
      val vehicleIdentity = (vehicle:Vehicle) => vehicle
      println(vehicleIdentity(Car()))
      println(vehicleIdentity(Motorcycle()))
      //invariant so it expects exact input
      val p1: ParkingInvariant[Vehicle] = ParkingInvariant[Vehicle](new Car)

      // covariant same type and its sub type
      val p2: ParkingCovariant[Vehicle] = ParkingCovariant[Car](new Car)
      println(p2)
      
      //Contravariance same type or super type
      val p3: ParkingContravariant[Car] = ParkingContravariant[Vehicle]
      println(p3)
  }
}