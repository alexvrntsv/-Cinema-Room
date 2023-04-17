fun main() {
    val report = readLine()!!
    val regex = Regex("[0-9] wrong answer.?")
    println(regex.matches(report))

}
