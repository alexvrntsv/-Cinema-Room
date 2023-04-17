fun main() {
    val n = readln().toInt()
    val list = MutableList(n) { readln().toInt() }
    val sortedList = list.sorted()
    for (i in 0 until list.size) {
        if (list[i] == sortedList[sortedList.lastIndex]) {
            println(i)
            break
        }
    }
}
