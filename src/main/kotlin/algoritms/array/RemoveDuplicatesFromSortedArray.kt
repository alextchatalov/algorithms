package algoritms.array

// Exercise from leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

fun main() {
    val result = removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
    print(result)
}

fun removeDuplicates(nums: IntArray): Int {
    var count = 1
    for (index in 1 until nums.size) {
        print("${nums[index]} != ${nums[index - 1]}\n")
        if (nums[index] != nums[index - 1]) {
            nums[count] = nums[index]
            print(nums.toList())
            count++
        }
    }
    nums.indexOf(count)
    return count
}
