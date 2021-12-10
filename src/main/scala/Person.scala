
//Defined a class which extends a trait ordered
class Person(val name: String, val age: Int) extends Ordered[Person] {

  //Checking for the parameters if it is equal
  def compare(that: Person): Int = {
    //Checking for age
    if (that.name == this.name)
      this.age.compare(that.age)

    else this.name.compare(that.name)
  }
}

//This is the main
object Person {

  def main(args: Array[String]): Unit = {

    val personOne = new Person("TestAgain", 24)
    val personTwo = new Person("Test", 25)
    println(personOne < personTwo)


  }
}