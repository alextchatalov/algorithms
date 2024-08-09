package algoritms.hashmap
// Leetcode 2215. Find the Difference of Two Arrays: https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

fun main() {
    val result = findDifference(intArrayOf(1, 2, 3, 3), intArrayOf(1, 1, 2, 2))
    result.forEach {
        println(it.joinToString(", ", "[", "]"))
    }
}

// Time: O(n + m)
// Space: O(n + m)
fun findDifference(
    nums1: IntArray,
    nums2: IntArray,
): List<List<Int>> {
    val map1 = mutableMapOf<Int, Int>()
    val map2 = mutableMapOf<Int, Int>()

    for (num in nums1) {
        if (map1.containsKey(num)) {
            map1[num] = map1[num]!! + 1
        } else {
            map1[num] = 1
        }
    }
    for (num in nums2) {
        if (map2.containsKey(num)) {
            map2[num] = map2[num]!! + 1
        } else {
            map2[num] = 1
        }
    }

    val result1 = map1.keys.filter { it !in map2 }
    val result2 = map2.keys.filter { it !in map1 }

    return listOf(result1, result2)
}
