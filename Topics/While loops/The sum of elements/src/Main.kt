fun main() {
    var sum = 0
    var scanner: Int
    do {
        scanner = readln().toInt()
        sum += scanner
    } while (scanner != 0)
    println(sum)
}
