package algoritms.array.twopointers

// Leetcode 283. Move Zeros: https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    val param = intArrayOf(1, 0, 0, 2, 0, 3)
    moveZeroes(param)
    param.forEach { println(it) }
}

// Time complexity: O(n)
// Space complexity: O(1)
fun moveZeroes(nums: IntArray) {
    var lastNonZeroFoundAt = -1
    for (i in nums.indices) {
        if (nums[i] != 0) {
            lastNonZeroFoundAt++
            val temp = nums[i]
            nums[i] = nums[lastNonZeroFoundAt]
            nums[lastNonZeroFoundAt] = temp
        }
    }
}
