package algoritms.array.prefixsum
// Leetcode 1732. Find the highest altitude: https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75

fun main() {
    val result = largestAltitude(intArrayOf(-5, 1, 5, 0, -7))
    println(result)
}

// Time complexity: O(n)
// Space complexity: O(1)
fun largestAltitude(gain: IntArray): Int {
    var max = 0
    var current = 0
    for (element in gain) {
        current += element
        max = maxOf(max, current)
    }
    return max
}
