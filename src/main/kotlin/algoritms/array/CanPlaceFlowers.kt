package algoritms.array

// Leetcode 605. Can place flowers: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
fun main() {
    println(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1)) // apbqcr
}

// Time complexity: O(n)
// Space complexity: O(1)
fun canPlaceFlowers(
    flowerbed: IntArray,
    n: Int,
): Boolean {
    var maxOfNumberFlowers = 0
    flowerbed.forEachIndexed { index, flower ->
        val prev = if (index == 0) 0 else flowerbed[index - 1]
        val next = if (index == flowerbed.size - 1) 0 else flowerbed[index + 1]
        if (flower == 0 && prev == 0 && next == 0) {
            maxOfNumberFlowers++
            flowerbed[index] = 1
        }
    }
    return maxOfNumberFlowers >= n
}
