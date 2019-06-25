fun main() {
    val array = arrayOf(4, 2, 7, 1, 3)
    println(array.joinToString { it.toString() })
    val sortedArray = insertionSort(array)
    println(sortedArray.joinToString { it.toString() })
}

fun insertionSort(a: Array<Int>): Array<Int> {
    for (i in 1..(a.size-1)) {
        val tmpValue = a[i]
        for (j in (i-1) downTo 0) {
            if (a[j] > tmpValue) {
                a[j+1] = a[j]
                a[j] = tmpValue
            }
        }
        println(a.joinToString { it.toString() })
    }
    return a
}
