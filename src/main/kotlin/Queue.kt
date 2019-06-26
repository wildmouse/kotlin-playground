fun main() {
    val queue = Queue()
    queue.push(1)
    queue.push(5)
    queue.push(19)
    queue.push(3)
    queue.push(6)
    queue.print()
    println(queue.pop())
    queue.print()
}

class Queue() {
    private var queue: Array<Int?> = arrayOfNulls(10)

    private var currentIndex = 0

    fun push(v: Int) {
        queue[currentIndex++] = v
    }

    fun pop(): Int? {
        val v = queue[--currentIndex]
        queue = queue.copyOfRange(1, queue.size).copyOf(10)
        return v
    }

    fun print() {
        println(queue.joinToString { it.toString() })
    }
}