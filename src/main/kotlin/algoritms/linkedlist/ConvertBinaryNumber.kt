package algoritms.linkedlist

// Leetcode: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

fun main() {
    getDecimalValue(
        ListNode(1).apply {
            next =
                ListNode(0).apply {
                    next = ListNode(1)
                }
        },
    ).also {
        println(it) // 5
    }
}

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun getDecimalValue(head: ListNode?): Int {
    var result = ""
    var current = head
    while (current != null) {
        result += current.`val`
        current = current.next
    }
    return result.toInt(2)
}
