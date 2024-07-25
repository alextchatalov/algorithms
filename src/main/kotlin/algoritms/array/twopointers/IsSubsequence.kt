package algoritms.array.twopointers

// Leetcode 392. Is Subsequence: https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    val result = isSubsequence("abc", "ahbgdc")
    println(result)
}

// Time complexity: O(n)
// Space complexity: O(1)
fun isSubsequence(
    s: String,
    t: String,
): Boolean {
    var i = 0
    var j = 0
    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) {
            i++
        }
        j++
    }
    return i == s.length
}
