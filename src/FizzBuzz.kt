fun fizzBuzz(n: Int): Unit {
    // Write your code here

    for (i in 0..n) {
        if (n % 3 == 0 && n % 5 == 0) {
            println("FizzBuzz")
        } else if (n % 3 == 0) {
            println("Fizz")
        } else if (n % 5 == 0) {
            println("Buzz")
        } else {
            println("$n")
        }
    }

}