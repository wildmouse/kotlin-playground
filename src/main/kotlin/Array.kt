fun main(args: Array<String>) {
    val orderedArray = arrayOf(1, 3, 6, 8, 10, 13, 15, 18, 22, 25, 35, 40)
    println(orderedArray.joinToString { "$it" })
    binarySearch(orderedArray, 26)
}

fun binarySearch(a: Array<Int>, v: Int) {
    var start = 0
    var mid = a.size / 2
    var end = a.size - 1
    while(true) {
        if (a[mid] == v) {
            println("$start, $mid, $end, ${a[mid]}")
            println("A index of target value is $mid")
            return
        }
        if (start == mid || end == mid) {
            println("Value not found.")
            return
        }
        if (a[mid] > v) {
            println("$start, $mid, $end, ${a[mid]}")
            end = mid
            mid -= (end - start) / 2
        }
        if (a[mid] < v) {
            println("$start, $mid, $end, ${a[mid]}")
            start = mid
            mid += (end - start) / 2
        }
    }
}

fun linearSearchOrdered(a: Array<Int?>, v: Int) {
    for(i in 0..a.size) {
        if (a[i] == null || a[i]!! > v) {
            println("Target value is not contained.")
            return
        }
        if (a[i]!! == v) {
            println("An index of target value is $i")
            return
        }
    }
}

fun sortedInsert(a: Array<Int?>, v: Int) {
    for(i in 0..a.size) {
        if (a[i] == null || a[i]!! > v) {
            insert(a, v, i)
            return
        }
    }
}

fun insert(a: Array<Int?>, v: Int, index: Int) {
    if (index > a.size) {
        throw Exception("Array out of bound.")
    }
    for (i in (a.size-1) downTo index + 1) {
        a[i] = a[i-1]
    }
    a[index] = v
}


