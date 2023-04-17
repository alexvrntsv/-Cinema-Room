fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()
    val sleepDuration = if (h < a) {
        "Deficiency"
    } else if (h > b) {
        "Excess"
    } else "Normal"
    println(sleepDuration)
}
