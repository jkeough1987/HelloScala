/**
  * Created by joshuakeough on 10/17/16.
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    case class Hello(firstName: String, lastName: String, age: Int)
    case class Person(firstName: String, lastName: String, age: Int)
    case class Dog(name: String, breed: String, age: Int)
    case class Message(text: String, isNew: Boolean, respondedTo: Boolean)

    println(Message("Josh", false, true))
    println(Dog("Rover", "Rotty", 12))
    println(Person("Josh", "Keough", 29))

    val p = Person("Josh", "Keough", 29)
    val f = p.firstName
    val l = p.lastName
    val a = p.age
    println(s"Found your friend $f $l, He is $a")
  }



}
