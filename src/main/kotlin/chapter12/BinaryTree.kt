package chapter12

fun main() {
    val tree = BinaryTree(Node(50))
    tree.insert(25)
    tree.insert(10)
    tree.insert(4)
    tree.insert(11)
    tree.insert(33)
    tree.insert(30)
    tree.insert(40)
    tree.insert(75)
    tree.insert(56)
    tree.insert(52)
    tree.insert(61)
    tree.insert(89)
    tree.insert(82)
    tree.insert(95)
    tree.traverseAndPrint()
}

class BinaryTree(
    private var root: Node
) {
    fun search(v: Int, node: Node? = root): Node? {
        return if (node == null || node.value == v) {
            node
        } else if (v < node.value) {
            search(v, node.left)
        } else {
            search(v, node.right)
        }
    }

    fun insert(v: Int, node: Node = root) {
        val newNode = Node(v)
        if (node.value == v) {
            println("A value already exists.")
            return
        }
        if (node.value > v && node.left == null) {
            node.left = newNode
            return
        }
        if (node.value > v) {
            insert(v, node.left!!)
        }
        if (node.value < v && node.right == null) {
            node.right = newNode
            return
        }
        if (node.value < v) {
            insert(v, node.right!!)
        }
    }

    fun delete(v: Int, node: Node? = root): Node? {
        when {
            node == null -> return null
            v < node.value -> {
                node.left = delete(v, node.left)
                return node
            }
            v > node.value -> {
                node.right = delete(v, node.right)
                return node
            }
            else -> {
                if (node.left == null) {
                    return node.right
                }
                if (node.right == null) {
                    return node.left
                }
                node.right = lift(node.right!!, node)
                return node
            }
        }
    }

    fun traverseAndPrint(node: Node? = root) {
        if (node == null) {
            return
        }
        traverseAndPrint(node.left)
        println(node.value)
        traverseAndPrint(node.right)
    }

    private fun lift(node: Node, nodeToDelete: Node): Node {
        return if (node.left != null) {
            node.left = lift(node.left!!, nodeToDelete)
            node
        } else {
            nodeToDelete.value = node.value
            node.right!!
        }
    }
}

class Node(
    var value: Int,
    var left: Node? = null,
    var right: Node? = null
)

