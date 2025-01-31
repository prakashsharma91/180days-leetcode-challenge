package hard

import java.util.*


class `297- Serialize-and-Deserialize-Binary-Tree` {

    val SEP: String = "#"
    val NULL: String = "null"

    // Encodes a URL to a shortened URL.
    fun serialize(root: TreeNode?): String {
        val result = StringBuilder()
        inOrder(root, result);
        return result.toString();
    }

    fun inOrder(root:TreeNode?, result: StringBuilder){
        if (root == null) {
            result.append(NULL).append(SEP)
            return
        }
        result.append(root.`val`).append(SEP)
        inOrder(root.left, result)
        inOrder(root.right, result)
    }


    // Decodes your encoded data to tree.
    fun deserialize(data: String) : TreeNode?
    {
        if (data.isEmpty()) return null
        else {
            val que: Queue<String?> = LinkedList<String?>()
            for (s in data.split(SEP)) {
                que.add(s)
            }
            return createTree(que)
        }
    }

    fun createTree(que: Queue <String?> ) : TreeNode?
    {
        if (que.isEmpty()) {
            return null
        } else if (que.peek().equals(NULL)) {
            que.remove()
            return null
        } else {
            val head = TreeNode(Integer.valueOf(que.remove()))
            head.left = createTree(que)
            head.right = createTree(que)
            return head
        }
    }
}

class TreeNode(var `val`: Int) {
     var left: TreeNode? = null
    var right: TreeNode? = null
}