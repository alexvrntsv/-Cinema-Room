fun main() {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    var min = list[0]
    for (n in list) {
        if (n < min) {
            min = n
        }
    }
    println(min)
}
