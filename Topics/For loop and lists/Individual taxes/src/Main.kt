fun main() {
    val numberOfCompanies = readln().toInt()
    val companiesIncome = MutableList(numberOfCompanies) { readln().toDouble() }
    val companiesTax = MutableList(numberOfCompanies) { readln().toDouble() }
    val taxCalculation = mutableListOf<Double>()
    for (i in 0 until numberOfCompanies) {
        taxCalculation.add(companiesIncome[i] / 100 * companiesTax[i])
    }
    println(taxCalculation.indexOf(taxCalculation.maxOrNull()) + 1)
}
