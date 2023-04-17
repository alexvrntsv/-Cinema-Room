fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    val list = mutableListOf<Int>(a, b)
    println(list.maxOrNull())
}