fun main() {
    val n = readln().toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(n) {
        val x = readln().toInt()
        if (x > 0) {
            larger++
        } else if (x < 0) {
            smaller++
        } else {
            perfect++
        }
    }
    println("$perfect $larger $smaller")
}
