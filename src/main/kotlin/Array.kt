fun main(args: Array<String>) {

    val orderedArray = arrayOfNulls<Int>(10)
    sortedInsert(orderedArray, 1)
    sortedInsert(orderedArray, 2)
    sortedInsert(orderedArray, 3)
    sortedInsert(orderedArray, 4)
    sortedInsert(orderedArray, 5)
    sortedInsert(orderedArray, 6)
    sortedInsert(orderedArray, 7)
    sortedInsert(orderedArray, 8)
    sortedInsert(orderedArray, 9)
    println(orderedArray.joinToString { "$it" })
    sortedInsert(orderedArray, 19)
    println(orderedArray.joinToString { "$it" })
    linearSearchOrdered(orderedArray, 19)
    linearSearchOrdered(orderedArray, 18)
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


