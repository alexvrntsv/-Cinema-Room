/*fun main(){
    val double = "123"
    val string = "d"
    println(convertStringToDouble(double))
    println(convertStringToDouble(string))
}*/
fun convertStringToDouble(input: String): Double {
    try {
        input.toDouble()
    } catch (e: NumberFormatException){
        return 0.toDouble()
    }
    return input.toDouble()
}