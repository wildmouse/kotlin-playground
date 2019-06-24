fun main() {
    val array = arrayOf(12, 8, 7, 5, 4, 2, 1)
    println(array.joinToString { it.toString() })
    val sortedArray = bubbleSort(array)
    println(sortedArray.joinToString { it.toString() })
}

fun bubbleSort(a: Array<Int>): Array<Int> {
    while(true) {
        var swapped = false
        for (i in 0..(a.size-2)) {
            val left = a[i]
            val right = a[i + 1]
            if (left > right) {
                a[i] = right
                a[i + 1] = left
                swapped = true
            }
        }
        if (!swapped) {
            return a
        }
    }
}