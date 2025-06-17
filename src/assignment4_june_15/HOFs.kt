package assignment4_june_15
fun main() {
    // 11.
    fun applyFunc(x: Int, f: (Int) -> Int) = f(x)
    println(applyFunc(5) { it * 2 })

// 12.
    val squares = listOf(1, 2, 3).map { it * it }
    println(squares)

// 13.
    val numbers = listOf(10, 60, 80, 30)
    println(numbers.filter { it > 50 })

// 14.
    val list = listOf("a", "b", "c")
    list.forEachIndexed { i, v -> println("$i: $v") }

// 15.
    val isPalindrome: (String) -> Boolean = { it == it.reversed() }
    println(isPalindrome("madam"))

// 16.
    val factorial = (1..5).reduce { acc, i -> acc * i }
    println(factorial)
    // 17.
    fun operateOnNumbers(a: Int, b: Int, op: (Int, Int) -> Int) = op(a, b)
    println(operateOnNumbers(5, 3) { x, y -> x + y })
    println(operateOnNumbers(5, 3) { x, y -> x * y })
    println(operateOnNumbers(5, 3) { x, y -> x - y })

// 18.
    val nums2 = listOf(1, 2, 3, 4, 5, 1)
    println(nums2.takeWhile { it < 4 })
    println(nums2.dropWhile { it < 4 })
}