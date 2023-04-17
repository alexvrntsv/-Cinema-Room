import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val transaction = scanner.nextInt()
        if (balance - transaction < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $transaction.")
            return
        }
        balance -= transaction
    }
    println("Thank you for choosing us to manage your account! Your balance is $balance.")
}
