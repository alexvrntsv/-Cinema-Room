fun main() {
    val a = readln().toInt()
    val range = a > -15 && a <= 12 || a > 14 && a < 17 || a >= 19
    println(
        if (range) {
            "True"
        } else {
            "False"
        }
    )
}
