package algoritms.linkedlist

// Leetcode 876. Middle of the Linked List: https://leetcode.com/problems/middle-of-the-linked-list/description/
fun main() {
    val li = ListNode(1)
    val li2 = ListNode(2)
    val li3 = ListNode(3)
    val li4 = ListNode(4)
    val li5 = ListNode(5)
    val li6 = ListNode(6)
    li.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = li5
    li5.next = li6
    var middleValues = middleNode(li)
    while (middleValues?.next != null) {
        println(middleValues.`val`)
        middleValues = middleValues.next
    }
}

fun middleNode(head: ListNode): ListNode? {
    // percorrer a lista de para achar o tamanho
    var size = 0
    var current: ListNode? = head
    while (current != null) {
        size++
        current = current.next
    }
    // meio da lista
    val isEven = size % 2
    val middle = size / 2
    if (isEven != 0) {
        middle - 1
    }
    // percorrer a lista novamente e adicionar somente os numeros da metade para frente
    current = head
    var currentSize = 0
    while (current != null) {
        if (currentSize >= middle) {
            return current
        }
        current = current.next
        currentSize++
    }
    return null
}
