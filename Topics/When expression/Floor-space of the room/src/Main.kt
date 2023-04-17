const val PI = 3.14

fun main() {
    when (readln()) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val halfSum = (a + b + c) / 2
            println(kotlin.math.sqrt(halfSum * (halfSum - a) * (halfSum - b) * (halfSum - c)))
        }

        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            println(a * b)
        }

        "circle" -> {
            val r = readln().toDouble()
            println(PI * r * r)
        }
    }
}