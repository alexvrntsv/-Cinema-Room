fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    numbers.add(0, numbers.sum())
    numbers.remove(numbers[numbers.size - 2])
    println(numbers.joinToString(" "))
}
