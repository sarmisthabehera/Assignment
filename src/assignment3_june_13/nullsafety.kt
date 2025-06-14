package assignment3_june_13

fun main() {
    // 1. Nullable String Length
    var username: String? = "JohnDoe"
    println("1. Length of username: ${username?.length}")

    // 2. Safe Length Function
    fun getLength(input: String?): Int {
        return input?.length ?: 0
    }
    println("2. Length from getLength(): ${getLength("Kotlin")}")
    println("2. Null input to getLength(): ${getLength(null)}")

    // 3. Use let with Nullable Variable
    val name: String? = "Nitish"
    name?.let {
        println("3. Name in uppercase: ${it.uppercase()}")
    }

    // 4. Use Elvis Operator
    val email: String? = null
    println("4. Email: ${email ?: "No email provided"}")

    // 5. Safe Casting with Nullable Type
    val data: Any = 25
    val age: Int? = data as? Int
    println("5. Safely casted age: $age")

    // 6 & 7. Fix NullPointerException
    var address: String? = null
    val len = address?.length ?: 0
    println("6. Length of address: $len")

    // 8. (same as 6 & 7 already handled)

    // 9. Use run Block with Nullable Variable
    val token: String? = "ABC123"
    token?.run {
        println("9. Token inside run block: $this")
    }
}