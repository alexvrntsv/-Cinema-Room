import java.lang.ArithmeticException

fun solution() {
    val a = readln().toInt()
    val b = readln().toInt()
    try {
        println(a / b)
    } catch (e: ArithmeticException) {
        println("Mesedj")
    } finally {
        println("This is the end, my friend.")
    }
}