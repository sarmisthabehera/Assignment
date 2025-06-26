package assignment2_june_9

fun main() {
    // 1.
    val list1 = (1..10).toList()
    for (num in list1) {
        if (num % 2 == 0) println(num)
    }
    //2.
    val names = mutableListOf("Alice", "Bob", "Ankit", "Charlie")
    val iterator = names.iterator()
    while (iterator.hasNext()) {
        if (iterator.next().startsWith("A")) iterator.remove()
    }
    println(names)
    //3.
    val studentMarks = mapOf("John" to 80, "Alice" to 70, "Bob" to 90)
    for ((name, mark) in studentMarks) {
        if (mark > 75) println(name)
    }
    //4.
    val words = listOf("Apple", "Sun", "Galaxy", "Sky", "Flower")
    var count = 0
    for (word in words) {
        if (word.length > 4)
            count++
    }
    println("Count: $count")
    //5.
    val nums = listOf(1, 2, 3, 4, 5)
    for (n in nums) {
        println(n * n)
    }

    }