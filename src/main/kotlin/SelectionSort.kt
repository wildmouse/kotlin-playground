fun main() {
    val array = arrayOf(5, 2, 7, 28, 1, 3, 4)
    println(array.joinToString { it.toString() })
    val sortedArray = selectionSort(array)
    println(sortedArray.joinToString { it.toString() })
}

fun selectionSort(a: Array<Int>): Array<Int> {
    var startIndex = 0
    while(startIndex < a.size-1) {
        var minValueIndex = startIndex
        for (i in startIndex..(a.size-1)) {
            if (a[minValueIndex] > a[i]) {
                minValueIndex = i
            }
        }
        if (startIndex != minValueIndex) {
            val tmp = a[startIndex]
            a[startIndex] = a[minValueIndex]
            a[minValueIndex] = tmp
        }
        startIndex++
    }
    return a
}