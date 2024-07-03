package algoritms.linkedlist

// Leetcode 160. Intersection of Two Linked Lists: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
fun main() {
    val headA = listA()
    val headB = listB()
    var intersection = getIntersectionNode(headA, headB)
    while (intersection?.next != null) {
        println(intersection.`val`)
        intersection = intersection.next
    }
}

fun getIntersectionNode(
    headA: ListNode?,
    headB: ListNode?,
): ListNode? {
    var a = headA
    var b = headB
    while (a != b) {
        a = if (a == null) headB else a.next
        b = if (b == null) headA else b.next
    }
    return a
}

fun listA(): ListNode {
    val li = ListNode(4)
    val li2 = ListNode(1)
    val li3 = ListNode(8)
    val li4 = ListNode(4)
    val li5 = ListNode(5)
    li.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    return li
}

fun listB(): ListNode {
    val li = ListNode(5)
    val li2 = ListNode(6)
    val li3 = ListNode(1)
    val li4 = ListNode(8)
    val li5 = ListNode(4)
    val li6 = ListNode(5)
    li.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    li5.next = li6
    return li
}
