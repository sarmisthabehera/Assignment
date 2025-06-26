package assignment2_june_9

fun main()
{
    // 11.
        var nullableStr: String? = "Kotlin"
        if (!nullableStr.isNullOrBlank()) {
            println("Reversed: ${nullableStr.reversed()}")
        }
    // 12.
        var number: Int? = 10
        val message = if (number != null) {
            "The value is $number"
        } else {
            "Value is missing"
        }
        println(message)
    // 13.
        var numStr: String? = "123"
        val result = if (!numStr.isNullOrEmpty()) {
            val intValue = numStr.toIntOrNull()
            if (intValue != null) intValue * 2 else 0
        } else {
            0
        }
        println("Multiplied value: $result")
    // 14.
        val list: List<Int>? = listOf(5, 8, 12, 3)
        println("Max: ${maxInNullableList(list)}")
    // 15.
        var testStr: String? = "Hello"
        println("Length using !!: ${testStr!!.length}")
        println("Length using ?.: ${testStr?.length}")
        println("Length using ?: ${testStr?.length ?: -1}")

// Function for Q14
    fun maxInNullableList(input: List<Int>?): Int {
        if (input.isNullOrEmpty())
            return -1
        var max = input[0]
        for (i in input) {
            if (i > max) max = i
        }
        return max

}