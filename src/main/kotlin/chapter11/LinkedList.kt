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
    linkedList.printAllNodes()
}

class LinkedList(var firstNode: Node) {
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
