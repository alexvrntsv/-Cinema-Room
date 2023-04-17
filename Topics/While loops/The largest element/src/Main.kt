fun main() {
    var n = readln().toInt()
    var max = n
    do {
        n = readln().toInt()
        if (n > max && n != 0) {
            max = n
        }
    } while (n > 0)
    println(max)
}