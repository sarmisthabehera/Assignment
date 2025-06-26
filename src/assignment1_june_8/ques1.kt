package assignment1_june_8

fun main()
{
    // 1.
        val shopName = "Starbuzz"
        println("Welcome to $shopName!")
    // 2.
        var favoriteCoffee = "Latte"
        println(favoriteCoffee.lowercase())
    // 3.
        val lattePrice = 3.5
        println("A latte costs $$lattePrice. Worth every penny!")
    // 4.
        var size1 = "Small"
        var size2 = "Large"
        val temp = size1
        size1 = size2
        size2 = temp
        println("Size1: $size1, Size2: $size2")
    // 5.
        val orderNumber = 7
        if (orderNumber % 2 == 0) println("Even order!") else println("Odd order!")

    // 6.
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
    // 7.
        for (price in 1..10) {
            if (price % 2 == 0) println("$price is divisible by 2")
        }
    // 8.
        for (cup in 5 downTo 1) {
            println("$cup cups left")
        }
    // 9.
        val age = 65
        if (age >= 60) println("Eligible for senior discount") else println("Not eligible")
    // 10.
        val caffeine = 70
        val strength = when(caffeine) {
            in 0..30 -> "Mild"
            in 31..70 -> "Medium"
            else -> "Strong"
        }
        println("Coffee strength: $strength")
    // 11.
    var strengthLevel = 0
    while (strengthLevel < 80) {
        println("Brewing... strength is $strengthLevel")
        strengthLevel += 10
    }
    // 12.
    val price = 6
    val priceCategory = when(price) {
        in 0..3 -> "Low"
        in 4..6 -> "Medium"
        else -> "High"
    }
    println("Price category: $priceCategory")
    // 13.
    val basePrice = 10
    for (discount in 10..50 step 10) {
        val finalPrice = basePrice - (basePrice * discount / 100.0)
        println("$discount% off: $$finalPrice")
    }
    // 14.
    val tempC = 65
    val tempMsg = when {
        tempC < 50 -> "Too Cold"
        tempC in 50..70 -> "Perfect"
        else -> "Too Hot"
    }
    println("Coffee is $tempMsg")
    // 15.
    var inventory = 10
    do {
        println("Inventory: $inventory")
        inventory--
    } while (inventory > 0)
    // 16.
    val orderName = "Mocha"
    if (orderName.length >= 5) println("Valid name") else println("Name too short")

    // 17.
    for (i in 1..4) {
        for (j in 1..4) {
            print("☕ ")
        }
        println()
    }
    // 18.
    val tipNum = (1..4).random()
    val tip = when(tipNum) {
        1 -> "Always smile!"
        2 -> "Clean the grinder."
        3 -> "Restock the cups."
        4 -> "Offer samples."
        else -> "Stay caffeinated!"
    }
    println("Tip: $tip")
    // 19.
    for (i in 1..10) {
        if (i == 5) {
            println("Rush hour!")
            break
        }
        println("Order $i")
    }
    // 20.
    for (i in 1..10) {
        if (i == 3 || i == 7) continue
        println("Order $i")
    }

}