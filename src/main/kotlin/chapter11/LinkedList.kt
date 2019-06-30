package chapter11

fun main() {
    val first = Node("a")
    val second = Node("b")
    first.link = second
    val third = Node("c")
    second.link = third
    val fourth = Node("d")
    third.link = fourth

    val linkedList = LinkedList(first)
    println(linkedList.read(2))
}

class LinkedList(var firstNode: Node) {
    fun read(index: Int): String {
        var aNode = firstNode
        for(i in 0 until index) {
            if (aNode.link == null) {
                println("No such element.")
            }
            aNode = aNode.link!!
        }
        return aNode.value
    }

    fun printAllNodes() {
        var aNode = firstNode
        while(true)
        {
            val v = aNode.value
            println(v)
            if (aNode.link == null) {
                break
            }
            aNode = aNode.link!!
        }
    }
}

class Node(
    var value: String,
    var link: Node? = null
)
