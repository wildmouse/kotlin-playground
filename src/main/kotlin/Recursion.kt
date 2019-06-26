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

fun factorial(number: Int, v: Int = 1): Int {
    if (number <= 0) {
        return v
    }
    return factorial(number - 1, v * number)
}