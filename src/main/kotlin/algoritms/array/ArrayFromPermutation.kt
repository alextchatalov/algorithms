package algoritms.array

class ArrayFromPermutation {
    companion object {
        fun buildArray(nums: IntArray): IntArray {
            val ans = mutableListOf<Int>()
            for (i in 0 until nums.size) {
                ans.add(nums[nums[i]])
            }
            return ans.toIntArray()
        }
    }
}
