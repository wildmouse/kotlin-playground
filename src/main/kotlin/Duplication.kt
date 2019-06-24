fun main() {
    val array = arrayOf(1, 2, 3, 5, 6, 7, 1)
    println(hasDuplicateValue(array))
}

fun hasDuplicateValue(a: Array<Int>): Boolean {
    val existingValues = arrayOfNulls<Int>(1 + a.max()!!)
    for (i in 0..(a.size-1)) {
        if (existingValues[a[i]] == null) {
            existingValues[a[i]] = 1
        } else {
            return true
        }
    }
    return false
}