fun main() {
    val a = readln().toUInt()
    val b = readln().toUInt()
    val c = readln().toUInt()
    var x = a % 2u
    x = if (x == 1u) a / 2u + 1u else a / 2u
    var y = b % 2u
    y = if (y == 1u) b / 2u + 1u else b / 2u
    var z = c % 2u
    z = if (z == 1u) c / 2u + 1u else c / 2u
    println(x + y + z)

}