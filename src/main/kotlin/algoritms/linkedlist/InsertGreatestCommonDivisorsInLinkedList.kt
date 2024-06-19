package algoritms.linkedlist

// Leetcode 2807. Insert Greatest Common Divisors in LinkedList: https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/
fun main() {
    val li = ListNode(18)
    val li2 = ListNode(6)
    val li3 = ListNode(10)
    val li4 = ListNode(3)
    li.next = li2
    li2.next = li3
    li3.next = li4
    li4.next = null
    var greatestCommonDivisors = insertGreatestCommonDivisors(li)
    while (greatestCommonDivisors?.next != null) {
        println(greatestCommonDivisors.`val`)
        greatestCommonDivisors = greatestCommonDivisors.next
    }
}

// Para acharmos o maior divisor comum entre dois números, utilizamos o algoritmo de Euclides.
fun insertGreatestCommonDivisors(head: ListNode): ListNode? {
    // Nosso valor atual é o head
    var current: ListNode? = head
    // Interamos a lista até o final
    while (current?.next != null) {
        // Criamos uma variavél para receber o próximo valor
        val currentNext = current.next
        // Criamos um novo nó com o valor do maior divisor comum entre o valor atual e o próximo valor
        val newNext = ListNode(gcdByEuclidsAlgorithm(current.`val`, current.next?.`val` ?: 0))
        // O próximo valor do novo nó é o próximo valor do valor atual
        newNext.next = current.next
        // O próximo valor do valor atual que está sendo interado é o novo nó
        current.next = newNext
        // O valor atual é o próximo valor para continuarmos a interação
        current = currentNext
    }
    // Retornamos o head, pois o current é um ponteiro para o head, todas as alterações ocorridas no current foram refletidas no head
    return head
}

// Função para achar o maior divisor comum entre dois números
// Aqui fazemos uma recursividade sempre passando o segundo valor e o resto da divisão do primeiro valor pelo segundo valor
// até que o segundo valor seja 0, quando isso ocorre, retornamos o primeiro valor
private fun gcdByEuclidsAlgorithm(
    n1: Int,
    n2: Int,
): Int {
    if (n2 == 0) {
        return n1
    }
    return gcdByEuclidsAlgorithm(n2, n1 % n2)
}
