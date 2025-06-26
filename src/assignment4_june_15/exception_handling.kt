package assignment4_june_15
fun main() {
// 19.
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
    }

    // 20.
    fun checkInput(input: String) {
        if (input.isBlank()) throw IllegalArgumentException("Input cannot be blank")
    }
    try {
        checkInput("")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

// 21.
    try {
        val num = "abc".toInt()
    } catch (e: NumberFormatException) {
        println("Invalid number format")
    }

// 22.
    val list3 = listOf(1, 2)
    try {
        println(list3[3])
    } catch (e: Exception) {
        println("Error: ${e.message}")
    } finally {
        println("End of operation")
    }

    // 23.
    fun throwError() {
        throw Exception("Custom error")
    }
    try {
        throwError()
    } catch (e: Exception) {
        println(e.message)
    }

    // 24.
    class InvalidAgeException(message: String) : Exception(message)

    fun checkAge(age: Int) {
        if (age < 18) throw InvalidAgeException("Age must be >= 18")
    }
    try {
        checkAge(16)
    } catch (e: InvalidAgeException) {
        println(e.message)
    }

    // 25.
    fun multiCatch() {
        try {
            val arr = arrayOf(1, 2)
            println(arr[5])
            val str: String? = null
            println(str!!.length)
        } catch (e: IndexOutOfBoundsException) {
            println("Index error")
        } catch (e: NullPointerException) {
            println("Null error")
        }
    }
    multiCatch()
}