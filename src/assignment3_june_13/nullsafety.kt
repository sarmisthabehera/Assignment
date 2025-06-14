package assignment3_june_13

fun main()
{
    // 1.
    var username: String? = "JohnDoe"
    println("Length of username: ${username?.length}")
    // 2.
    fun getLength(input: String?): Int {
        return input?.length ?: 0
    }
    println(" Length from getLength(): ${getLength("Kotlin")}")
    println(" Null input to getLength(): ${getLength(null)}")
    // 3.
    val name: String? = "Nitish"
    name?.let {
        println("Name in uppercase: ${it.uppercase()}")
    }
    // 4.
    val email: String? = null
    println("Email: ${email ?: "No email provided"}")
    // 5.
    val data: Any = 25
    val age: Int? = data as? Int
    println("Safely casted age: $age")
    // 6 & 7
    var address: String? = null
    val len = address?.length ?: 0
    println("Length of address: $len")
    // 8.
    // 9.
    val token: String? = "ABC123"
    token?.run {
        println("Token inside run block: $this")
    }
}