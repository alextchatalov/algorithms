package algoritms.array

// Leetcode 1768. Merge Strings Alternately: https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    println(mergeAlternately("abc", "pqr")) // apbqcr
}

fun mergeAlternately(
    word1: String,
    word2: String,
): String {
    val result = StringBuilder()
    val maxLength = maxOf(word1.length, word2.length)
    for (i in 0 until maxLength) {
        if (i < word1.length) {
            result.append(word1[i])
        }
        if (i < word2.length) {
            result.append(word2[i])
        }
    }
    return result.toString()
}
