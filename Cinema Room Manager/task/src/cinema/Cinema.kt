package cinema

const val SMALLHALL = 60
const val MAXPRICE = 10
const val MINPRICE = 8

var purchasedTickets = 0
var currentIncome = 0

fun main() = menu(buildCinemaHall())

fun menu(list: MutableList<MutableList<String>>) {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    when (readln().toInt()) {
        1 -> printHall(list)
        2 -> buyTicket(list)
        3 -> statistics(list)
        0 -> return
    }
    menu(list)
}

fun userInput(massage: String): Int {
    println(massage)
    val number = try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        println("Wrong input!")
        userInput(massage)
    }
    return number
}

fun buildCinemaHall(): MutableList<MutableList<String>> {
    val numberOfRows = userInput("Enter the number of rows:")
    val numberOfSeats = userInput("Enter the number of seats in each row:")
    //building a hall
    val cinemaHall: MutableList<MutableList<String>> = mutableListOf()
    repeat(numberOfRows + 1) {
        cinemaHall.add(mutableListOf<String>())
    }
    cinemaHall[0].add("Cinema:\n ")
    for (seatNumber in 1..numberOfSeats) {
        cinemaHall[0].add(seatNumber.toString())
    }
    for (rowNumber in 1..numberOfRows) {
        cinemaHall[rowNumber].add(rowNumber.toString())
        for (seats in 1.. numberOfSeats) {
            cinemaHall[rowNumber].add("S")
        }
    }
    return cinemaHall
}

fun printHall(list: MutableList<MutableList<String>>) {
    for (i in 0..list.lastIndex) {
        println(list[i].joinToString(" "))
    }
}

fun buyTicket(list: MutableList<MutableList<String>>) {
    val rowNumber = userInput("Enter a row number:")
    val seatNumber = userInput("Enter a seat number in that row:")
    try {
        if (list[rowNumber][seatNumber] == "B") {
            println("That ticket has already been purchased!")
            buyTicket(list)
            return
        }
    } catch (e: IndexOutOfBoundsException) {
        println("Wrong input!")
        buyTicket(list)
        return
    }
    val itIsPremiumRow = rowNumber <= (list.lastIndex) / 2
    val itIsSmallHall = list.lastIndex * list[0].lastIndex <= SMALLHALL
    if (itIsSmallHall || itIsPremiumRow) {
        println("Ticket price: \$$MAXPRICE")
        currentIncome += MAXPRICE
    } else {
        println("Ticket price: \$$MINPRICE")
        currentIncome += MINPRICE
    }
    list[rowNumber][seatNumber] = "B"
    purchasedTickets++
}

fun statistics(list: MutableList<MutableList<String>>) {
    val itIsSmallHall = list.lastIndex * list[0].lastIndex <= SMALLHALL
    val totalIncome = if (itIsSmallHall) {
        list.lastIndex * list[0].lastIndex * MAXPRICE
    } else {
        val premiumRows = list.lastIndex / 2
        premiumRows * list[0].lastIndex * MAXPRICE + (list.lastIndex - premiumRows) * list[0].lastIndex * MINPRICE
    }
    println("Number of purchased tickets: $purchasedTickets")
    val percentage: Double = if (purchasedTickets == 0) {
        0.0
    } else {
        purchasedTickets.toDouble() / (list.lastIndex.toDouble() * list.lastIndex.toDouble()) * 100.0
    }
    val formatPercentage = "%.2f".format(percentage)
    println("Percentage: $formatPercentage%")
    println("Current income: \$$currentIncome")
    println("Total income: \$$totalIncome")
}


