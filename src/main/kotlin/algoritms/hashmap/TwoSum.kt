package algoritms.hashmap
// Leetcode 1. Two Sum: https://leetcode.com/problems/two-sum/description/

fun main() {
    val result = bruteForceTwoSum(intArrayOf(3, 2, 4), 6)
    val resultUsingMap = mapTwoSum(intArrayOf(3, 2, 4), 6)
    println(resultUsingMap.joinToString())
}

// Time: O(n)
// Space: O(n)
fun mapTwoSum(
    nums: IntArray,
    target: Int,
): IntArray {
    val map = mutableMapOf<Int, Int>()
    for (index in nums.indices) {
        val complement = target - nums[index]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, index)
        }
        map[nums[index]] = index
    }
    return intArrayOf()
}

// Time: O(n2)
// Space: O(1)
fun bruteForceTwoSum(
    nums: IntArray,
    target: Int,
): IntArray {
    for (sumIndex in nums.indices) {
        for (numIndex in sumIndex + 1..<nums.size) {
            if (nums[sumIndex] + nums[numIndex] == target) {
                return intArrayOf(sumIndex, numIndex)
            }
        }
    }
    return intArrayOf()
}
