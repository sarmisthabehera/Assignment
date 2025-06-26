package assignment4_june_15
fun main() {
// 1.
    (1..20).filter { it % 2 == 0 }.forEach { println(it) }
// 2.
    val fruits = mutableListOf("Mango", "Banana", "Apple")
    fruits.removeAll { it.startsWith("M") }
    println(fruits)
// 3.
    val employees = mapOf("Aliva" to "HR", "Bobi" to "IT", "Arman" to "Finance")
    employees.forEach { (name, dept) -> println("$name -> $dept") }
// 4.
    val names = listOf("Michael", "John", "Alexa", "Kiran")
    println(names.count { it.length > 5 })
// 5.
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(3, 4, 5)
    val merged = (list1 + list2).distinct()
    println(merged)
// 6.
    val strList = listOf("hello", "world")
    val lengths = strList.map { it.length }
    println(lengths)
// 7.
    val items = mapOf("Laptop" to 50000, "Mouse" to 300, "Keyboard" to 700)
    items.filter { it.value > 500 }.forEach { println(it) }
// 8.
    val sentence = "music can be very calming"
    val vowels = sentence.lowercase().filter { it in "aeiou" }.toSet()
    println(vowels)
// 9.
    val nums = listOf(5, 1, 9, 3)
    println(nums.sortedDescending())
// 10.
    val set = setOf(1, 2, 3)
    val check = 2
    println(if (check in set) "Exists" else "Does not exist")
}