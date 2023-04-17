fun main() {
    val a = readln().toInt()
    val z = readln().toInt()
    for (n in a..z) {
        if (n % 3 == 0 && n % 5 == 0) {
            println("FizzBuzz")
        } else if (n % 3 == 0) {
            println("Fizz")
        } else if (n % 5 == 0) {
            println("Buzz")
        } else {
            println(n)
        }
    }
}