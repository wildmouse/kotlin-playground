fun main(args: Array<String>) {
    val array = arrayOfNulls<Int>(10)
    array[0] = 3
    array[1] = 17
    array[2] = 80
    array[3] = 202
    println(array.joinToString { "$it" })
    insert(array, 5, 2)
    println(array.joinToString { "$it" })
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


