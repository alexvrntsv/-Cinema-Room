fun main() {
    val n = readln().toInt()
    var max = 0
    repeat(n) {
        val x = readln().toInt()
        if (x % 4 == 0 && x > max) {
            max = x
        }
    }
    println(max)
}
