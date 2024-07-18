package algoritms.array

// Leetcode 334. Increasing Triplet Subsequence: https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    val result = increasingTriplet(intArrayOf(1, 2, 3, 4, 5))

    println(result)
}

// Time complexity: O(n)
// Space complexity: O(1)
fun increasingTriplet(nums: IntArray): Boolean {
    var target = Int.MAX_VALUE
    var min = Int.MAX_VALUE
    for (n in nums) {
        if (n > target) return true
        if (n > min) target = n
        if (n < min) min = n
    }
    return false
}
