fun main() {
    val list = List(readln().toInt()) { readln().toInt() }
    var cont = 1
    var maxCount = 0
    for (i in 0 until list.size - 1) {
        if (list[i] <= list[i + 1]) {
            cont++
        } else if (list[i] > list[i + 1] && cont > maxCount) {
            maxCount = cont
            cont = 1
        }
    }
    println(if (cont > maxCount) cont else maxCount)
}
