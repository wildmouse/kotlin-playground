fun main(args: Array<String>) {
    val array = arrayOfNulls<Int>(10)
    array[0] = 3
    array[1] = 17
    array[2] = 80
    array[3] = 202
//    println(array.joinToString { "$it" })
//    insert(array, 5, 2)
//    println(array.joinToString { "$it" })

    val orderedArray = array.copyOf()
    println(orderedArray.joinToString { "$it" })
    sortedInsert(orderedArray, 19)
    println(orderedArray.joinToString { "$it" })
}

fun sortedInsert(a: Array<Int?>, v: Int) {
    for(i in 0..a.size) {
        if (a[i]!! > v) {
            insert(a, v, i)
            return
        }
    }
}

fun insert(a: Array<Int?>, v: Int, index: Int) {
    if (index > a.size) {
        throw Exception("Array out of bound.")
    }
    for (i in (a.size-1) downTo index) {
        a[i] = a[i-1]
    }
    a[index] = v
}


