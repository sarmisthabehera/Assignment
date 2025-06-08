package assignment1_june_8

fun main()
{
        // 1. Welcome message using string interpolation
        val shopName = "Starbuzz"
        println("Welcome to $shopName!")

        // 2. Favorite coffee in lowercase
        var favoriteCoffee = "Latte"
        println(favoriteCoffee.lowercase())

        // 3. Latte price constant
        val lattePrice = 3.5
        println("A latte costs $$lattePrice. Worth every penny!")

        // 4. Swap coffee cup sizes
        var size1 = "Small"
        var size2 = "Large"
        val temp = size1
        size1 = size2
        size2 = temp
        println("Size1: $size1, Size2: $size2")

        // 5. Check if coffee order number is even or odd
        val orderNumber = 7
        if (orderNumber % 2 == 0) println("Even order!") else println("Odd order!")

        // 6. Unique recommendation using when
        val day = 3
        val recommendation = when(day) {
            1 -> "Espresso"
            2 -> "Cappuccino"
            3 -> "Latte"
            4 -> "Mocha"
            5 -> "Americano"
            6 -> "Macchiato"
            7 -> "Cold Brew"
            else -> "Water"
        }
        println("Today's recommendation: $recommendation")

        // 7. Loop coffee prices and print those divisible by 2
        for (price in 1..10) {
            if (price % 2 == 0) println("$price is divisible by 2")
        }

        // 8. Countdown coffee cups
        for (cup in 5 downTo 1) {
            println("$cup cups left")
        }

        // 9. Check senior discount eligibility
        val age = 65
        if (age >= 60) println("Eligible for senior discount") else println("Not eligible")

        // 10. Coffee strength using when
        val caffeine = 70
        val strength = when(caffeine) {
            in 0..30 -> "Mild"
            in 31..70 -> "Medium"
            else -> "Strong"
        }
        println("Coffee strength: $strength")
}