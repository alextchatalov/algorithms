package algoritms.linkedlist

// Leetcode 21. Merge Two Sorted Lists: https://leetcode.com/problems/merge-two-sorted-lists/description/
fun main() {
    val li1 = ListNode(1)
    val li2 = ListNode(2)
    val li3 = ListNode(4)

    val li4 = ListNode(1)
    val li5 = ListNode(3)
    val li6 = ListNode(4)

    li1.next = li2
    li2.next = li3

    li4.next = li5
    li5.next = li6
    var orderedList = mergeTwoLists(li1, li4)
    while (orderedList?.next != null) {
        println(orderedList.`val`)
        orderedList = orderedList.next
    }
}

fun mergeTwoLists(
    list1: ListNode?,
    list2: ListNode?,
): ListNode? {
    if (list1 == null) return list2
    if (list2 == null) return list1
    if (list1.`val` < list2.`val`) {
        list1.next = mergeTwoLists(list1.next, list2)
        return list1
    } else {
        list2.next = mergeTwoLists(list1, list2.next)
        return list2
    }
}
