fun main() {
    println("Welcome to Kotlin!")

    // Asking for user input
    print("Please enter your name: ")
    val name = readLine()

    // Calling a function
    greetUser(name)

    // Demonstrating a basic loop and conditional
    println("Do you want to see a countdown? (yes/no)")
    val answer = readLine()

    if (answer == "yes") {
        countdown(5)
    } else {
        println("No countdown for you!")
    }
}

// Function to greet the user
fun greetUser(name: String?) {
    if (name.isNullOrBlank()) {
        println("Hello, stranger!")
    } else {
        println("Hello, $name!")
    }
}

// Function to perform a countdown
fun countdown(start: Int) {
    for (i in start downTo 1) {
        println(i)
    }
    println("Boom!")
}
