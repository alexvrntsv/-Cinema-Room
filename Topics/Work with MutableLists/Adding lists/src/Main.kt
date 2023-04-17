fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    val newList = firstList + secondList
    println(newList.joinToString())
}