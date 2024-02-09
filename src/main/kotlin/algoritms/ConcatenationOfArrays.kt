package algoritms

fun main() {
    val result = basicSolution(intArrayOf(1, 2, 1))
    print(result.joinToString(separator = ", "))
}

fun basicSolution(nums: IntArray): IntArray {
    val ans = IntArray(nums.size * 2)
    var indexFromNums = 0
    for (i in 0 until ans.size) {
        ans[i] = nums[indexFromNums]
        indexFromNums++
        if (i == nums.size) {
            indexFromNums = 0
        }
    }
    return ans
}

fun kotlinSolution(nums: IntArray): IntArray {
    // nums + nums acho que também funciona
    return mutableListOf<Int>()
        .apply { addAll(nums.toList()) }
        .apply { addAll(nums.toList()) }
        .toIntArray()
}
