fun main() {
    val n = readln().toInt()
    val list: MutableList<Int> = mutableListOf()
    for (i in 0 until n) {
        list.add(readln().toInt())
    }
    val (p, m) = readln()!!.split(" ").map { it.toInt() }
    var answer = "YES"
    for (i in 0 until list.size - 1) {
        if (list[i] == p && list[i + 1] == m || list[i] == m && list[i + 1] == p) {
            answer = "NO"
            break
        }
    }
    println(answer)
}
