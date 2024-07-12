package algoritms.array

// Leetcode 605. Can place flowers: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    println(reverseVowels("A man, a plan, a canal: Panama"))
}

// Time complexity: O(n)
// Space complexity: O(1)
fun reverseVowels(s: String): String {
    val vowels = "aeiouAEIOU".toCharArray()
    val chars = s.toCharArray()
    var left = 0
    var right = chars.size - 1
    while (left < right) {
        while (left < right && !vowels.contains(chars[left])) {
            left++
        }
        while (left < right && !vowels.contains(chars[right])) {
            right--
        }
        if (left < right) {
            val leftChar = chars[left]
            chars[left] = chars[right]
            chars[right] = leftChar
            left++
            right--
        }
    }
    return String(chars)
}
