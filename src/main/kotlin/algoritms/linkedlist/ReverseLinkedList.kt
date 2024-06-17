package algoritms.linkedlist

// Leetcode 206. Reverse Linked List: https://leetcode.com/problems/reverse-linked-list/description/
fun main() {
    val li = ListNode(5)
    val li2 = ListNode(4)
    val li3 = ListNode(3)
    val li4 = ListNode(2)
    val li5 = ListNode(1)
    li.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    var reversed = reverseLinkedList(li)
    while (reversed?.next != null) {
        println(reversed.`val`)
        reversed = reversed.next
    }
}

fun reverseLinkedList(head: ListNode): ListNode? {
    var prev: ListNode? = null
    var curr: ListNode? = head
    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}
