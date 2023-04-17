fun main() {
    val (a, b) = List(2) { readln().toInt() }
    var sum = 0
    for (i in a..b) {
        sum += i
    }
    println(sum)
}
