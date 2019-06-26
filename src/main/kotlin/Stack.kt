fun main() {
    val stack = Stack()
    stack.print()
    stack.push(5)
    stack.push(10)
    stack.push(12345000)
    stack.push(15)
    stack.print()
    println(stack.pop())
    stack.print()
}

class Stack(size: Int = 10) {
    private var stack: Array<Int?> = arrayOfNulls(size)

    private var currentIndex: Int = 0

    fun push(v: Int) {
        if (currentIndex == stack.size) {
            println("Stack is currently full.")
        }
        stack[currentIndex++] = v
    }

    fun pop(): Int? {
        if (currentIndex == 0) {
            println("Stack is currently empty.")
        }
        val v = stack[--currentIndex]
        stack[currentIndex] = null
        return v
    }

    fun print() {
        println(stack.joinToString { it.toString() })
    }
}