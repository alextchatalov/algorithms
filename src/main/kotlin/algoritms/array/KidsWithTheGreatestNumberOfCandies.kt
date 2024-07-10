package algoritms.array

// Leetcode 1431. Kids with the greatest number of candies: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    println(kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3)) // apbqcr
}

// Time complexity: O(n)
// Space complexity: O(1)
fun kidsWithCandies(
    candies: IntArray,
    extraCandies: Int,
): List<Boolean> {
    val maxPage = candies.maxOrNull() ?: 0
    return candies.map { it + extraCandies >= maxPage }
}
