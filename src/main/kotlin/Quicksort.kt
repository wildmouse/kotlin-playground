fun main() {
    val array = arrayOf(0, 5, 2, 1, 6, 3)
    println(array.joinToString { "$it" })
    quicksort(array, 0, array.size-1)
    println(array.joinToString { "$it" })
}

fun quicksort(a: Array<Int>, firstIndex: Int, lastIndex: Int) {
    if (lastIndex - firstIndex <= 0) {
        return
    }

    val (_, pivotIndex) = partition(a, firstIndex, lastIndex)

    quicksort(a, 0, pivotIndex - 1)
    quicksort(a, pivotIndex + 1, lastIndex)
}

fun partition(a: Array<Int>, firstIndex: Int, pivotIndex: Int): Pair<Array<Int>, Int> {
    var l = firstIndex
    var r = pivotIndex - 1
    while (true) {
        while (a[l] < a[pivotIndex]) {
            l++
        }
        while (a[r] > a[pivotIndex]) {
            r--
        }
        if (l >= r) {
            break
        } else {
            val tmp = a[r]
            a[r] = a[l]
            a[l] = tmp
        }
    }

    val tmp = a[pivotIndex]
    a[pivotIndex] = a[l]
    a[l] = tmp

    return Pair(a, l)
}

