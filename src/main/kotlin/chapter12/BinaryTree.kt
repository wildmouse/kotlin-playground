package chapter12

fun main() {
    val aNode1 = Node(1)
    val aNode2 = Node(10)
    val tree = BinaryTree(Node(5, aNode1, aNode2))

    val target = tree.search(8)
    println(target?.value.toString())
}

class BinaryTree(
    var root: Node
) {
    fun search(v: Int, node: Node? = root): Node? {
        return if (node == null || node.value == v) {
            node
        } else if (v < root.value) {
            search(v, node.left)
        } else {
            search(v, node.right)
        }
    }
}

class Node(
    val value: Int,
    val left: Node? = null,
    val right: Node? = null
)
