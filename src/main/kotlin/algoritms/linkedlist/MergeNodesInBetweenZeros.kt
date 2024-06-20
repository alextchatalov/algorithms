package algoritms.linkedlist

// Leetcode 2181. Merge Nodes in Between Zeros: https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
fun main() {
    val li = ListNode(0)
    val li2 = ListNode(3)
    val li3 = ListNode(1)
    val li4 = ListNode(0)
    val li5 = ListNode(4)
    val li6 = ListNode(5)
    val li7 = ListNode(2)
    val li8 = ListNode(0)
    li.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    li5.next = li6
    li6.next = li7
    li7.next = li8
    li8.next = null
    var mergedNodes = mergeNodes(li)
    while (mergedNodes != null) {
        println(mergedNodes.`val`)
        mergedNodes = mergedNodes.next
    }
}

fun mergeNodes(head: ListNode?): ListNode? {
    var current: ListNode? = head
    var summedNodes: ListNode? = head
    var sum = 0
    while (current != null) {
        if (current.`val` == 0) {
            if (sum != 0) {
                val newNext = ListNode(sum)
                newNext.next = current.next
                summedNodes?.next = newNext
                summedNodes = newNext
            }
            sum = 0
        } else {
            sum += current.`val`
        }
        current = current.next
    }
    return head?.next
}
