fun main() {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt()}
    val m = readln().toInt()
    if (list.indexOf(m) == -1) {
        println("NO")
    } else println("YES")
}