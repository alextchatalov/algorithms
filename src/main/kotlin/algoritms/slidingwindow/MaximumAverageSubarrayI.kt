package algoritms.slidingwindow

// Leetcode 643. Maximum Average Subarray I: https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    val result = findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4)
    println(result)
}

// Time complexity: O(n)
// Space complexity: O(1)
fun findMaxAverage(
    nums: IntArray,
    k: Int,
): Double {
    var sum = 0
    for (i in 0 until k) {
        sum += nums[i]
    }
    var maxSum = sum
    for (i in k until nums.size) {
        sum += nums[i] - nums[i - k]
        maxSum = maxOf(maxSum, sum)
    }
    return maxSum.toDouble() / k
}
