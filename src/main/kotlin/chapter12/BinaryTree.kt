package chapter12

fun main() {
    val aNode1 = Node(1)
    val aNode2 = Node(10)
    val tree = BinaryTree(Node(5, aNode1, aNode2))

    tree.insert(8)
    val target = tree.search(8)
    println(target?.value.toString())
}

class BinaryTree(
    var root: Node
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
}

class Node(
    var value: Int,
    var left: Node? = null,
    var right: Node? = null
)

//class Node(
//    var value: Int,
//    var left: Node? = null,
//    var right: Node? = null
//) {
//    fun insert(v: Int) {
//        val newNode = Node(v)
//        if (value > v && left == null) {
//            left = newNode
//            return
//        }
//        if (value > v) {
//            insert(v, left!!)
//        }
//    }
//}
