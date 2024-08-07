package algoritms.array.prefixsum
// Leetcode 724. Find pivot index: https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75

fun main() {
    val result = pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
    println(result)
}

// Time complexity: O(n)
// Space complexity: O(n)
fun pivotIndex(nums: IntArray): Int {
    val sumLeft: MutableList<Int> = mutableListOf()
    val sumRight: MutableList<Int> = mutableListOf()
    for (i in nums.indices) {
        sumLeft.add(nums[i] + if (i > 0) sumLeft[i - 1] else 0)
    }
    for (i in nums.size - 1 downTo 0) {
        sumRight.add(nums[i] + if (i < nums.size - 1) sumRight.last() else 0)
    }
    for (i in nums.indices) {
        if (sumLeft[i] == sumRight[nums.size - i - 1]) {
            return i
        }
    }
    return -1
}
