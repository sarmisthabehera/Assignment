package assignment3_june_13

   // 8.
class Person(val name: String, val age: Int) {
    fun showDetails()
    {
        println("8. Name: $name, Age: $age")
    }
    // 9.
    constructor(name: String) : this(name, 18)
}
    // 10.
open class Animal {
    open fun makeSound() {
        println("10. Animal sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("10. Dog barks")
    }
}
    // 11.
interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("11. Car is driving")
    }
}
  // 12.
abstract class Shape {
    abstract fun area(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double = 3.14 * radius * radius
}
  // 13.
data class User(val name: String, val email: String)
  // 14.
object Logger {
    fun log(message: String) {
        println("14. Log: $message")
    }
}
   // 15.
class MathUtils {
    companion object {
        fun square(n: Int): Int {
            return n * n
        }
    }
}

// MAIN function
fun main() {
    // 8 & 9
    val p1 = Person("Alice", 25)
    val p2 = Person("Bob") // uses secondary constructor
    p1.showDetails()
    p2.showDetails()

    // 10
    val myDog = Dog()
    myDog.makeSound()

    // 11
    val myCar = Car()
    myCar.drive()

    // 12
    val circle = Circle(5.0)
    println("12. Area of circle: ${circle.area()}")

    // 13
    val user1 = User("John", "john@example.com")
    val user2 = User("John", "john@example.com")
    println("13. Users are equal: ${user1 == user2}")

    // 14
    Logger.log("This is a singleton log message")

    // 15
    println("15. Square of 6 is: ${MathUtils.square(6)}")
}