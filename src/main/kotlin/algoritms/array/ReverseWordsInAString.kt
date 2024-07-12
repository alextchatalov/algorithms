package algoritms.array

// Leetcode 151. Reverse words in a string: https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    val result =
        reverseWords(
            "a      Tt98F8cl       2ZqzzN      9ScQuGTD       4zF18c   U5wrw62z    KV1 q     WK1Asi       S4hiKPi2Y  l      XZCvURMnY  I3   llmjK3AVT F    eaiDa     N6Rc 8QOxU P0ieWh ta",
        )

    println(result)
}

// Time complexity: O(n)
// Space complexity: O(1)
fun reverseWords(s: String): String {
    val split = s.trim().split("\\s+".toRegex()).toMutableList()
    var left = 0
    var right = split.size - 1
    while (left <= right) {
        if (split[left] == "") {
            left++
        }
        if (split[right] == "") {
            right--
        }
        if (split[left] != "" && split[right] != "") {
            val wordOLeft = split[left]
            split[left] = split[right]
            split[right] = wordOLeft
            left++
            right--
        }
    }
    return split.filter { it != "" }.joinToString(" ")
}
