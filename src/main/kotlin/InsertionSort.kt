fun main() {
    val array = arrayOf(4, 2, 7, 1, 3)
    println(array.joinToString { it.toString() })
    val sortedArray = insertionSort(array)
    println(sortedArray.joinToString { it.toString() })
}

fun insertionSort(a: Array<Int>): Array<Int> {
    for (i in 1 until a.size) {
        var index = i
        val tmpValue = a[i]
        while (index > 0 && a[index-1] > tmpValue) {
                a[index] = a[index-1]
                index--
        }
        a[index] = tmpValue
        println(a.joinToString { it.toString() })
    }
    return a
}
