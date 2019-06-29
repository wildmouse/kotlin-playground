fun main() {
    val array = arrayOf(0, 5, 2, 1, 6, 3)
    println(array.joinToString { it.toString() })
    val sortedArray = partition(array)
    println(sortedArray.joinToString { it.toString() })
}

fun partition(a: Array<Int>): Array<Int> {
    var i = 0
    var j = a.size - 2
    val pivotIndex = a.size - 1
    val pivot = a[pivotIndex]
    while (true) {
        while (a[i] < pivot) {
            i++
        }
        while (a[j] > pivot) {
            j--
        }
        if (i >= j) {
            break
        } else {
            val tmp = a[j]
            a[j] = a[i]
            a[i] = tmp
        }
    }
    a[pivotIndex] = a[i]
    a[i] = pivot

    return a
}