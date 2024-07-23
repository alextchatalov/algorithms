package algoritms.array

// Leetcode 443. String Compression: https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    val result =
        compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c'))

    println(result)
}

// Time complexity: O(n)
// Space complexity: O(1)
fun compress(chars: CharArray): Int {
    var index = 0
    var i = 0
    while (i < chars.size) {
        var j = i
        while (j < chars.size && chars[j] == chars[i]) {
            j++
        }
        chars[index++] = chars[i]
        if (j - i > 1) {
            val count = j - i
            for (c in count.toString()) {
                chars[index++] = c
            }
        }
        i = j
    }
    return index
}
