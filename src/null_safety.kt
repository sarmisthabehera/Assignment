fun main()
{
    // 1.
    var username: String? = "JohnDoe"
    println("1. Length of username: ${username?.length}")

    // 2.
    fun getLength(input: String?): Int {
        return input?.length ?: 0
    }
    println("2. Length from getLength(): ${getLength("Kotlin")}")
    println("2. Null input to getLength(): ${getLength(null)}")

    // 3.
    val name: String? = "Nitish"
    name?.let {
        println("3. Name in uppercase: ${it.uppercase()}")
    }

    // 4.
    val email: String? = null
    println("4. Email: ${email ?: "No email provided"}")

    // 5.
    val data: Any = 25
    val age: Int? = data as? Int
    println("5. Safely casted age: $age")

    // 6 & 7
    var address: String? = null
    val len = address?.length ?: 0
    println("6. Length of address: $len")

    // 8.

    // 9.
    val token: String? = "ABC123"
    token?.run {
        println("Token inside run block: $this")
    }
}