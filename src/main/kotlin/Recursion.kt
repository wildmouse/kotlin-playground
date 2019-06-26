fun main() {
//    countdown(10)
    println(factorial(5))
}

fun countdown(number: Int) {
    if (number < 0) {
        return
    }
    println(number.toString())
    countdown(number - 1)
}

fun factorial(number: Int): Int {
    if (number < 1) {
        println("Invalid argument.")
    }
    if (number == 1) {
        return number
    }
    return number * factorial(number - 1)
}