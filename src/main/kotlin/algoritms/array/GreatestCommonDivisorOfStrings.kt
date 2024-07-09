package algoritms.array

// Leetcode 1071. Greatest Common Divisor of Strings: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    println(mergeAlternately("abc", "pqr")) // apbqcr
}

// Time complexity: O(n+m)
// Space complexity: O(n+m)
fun gcdOfStrings(
    str1: String,
    str2: String,
): String {
    if ((str1 + str2) != (str2 + str1)) return ""

    var num1 = str1.length
    var num2 = str2.length
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    return str1.substring(0, num1)
}
