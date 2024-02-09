package algoritms

fun main() {
    val numbs = listOf(1, 3, 5, 7, 9, 10)
    val result = binarySearch(numbs, 10)
    print(result)
}

private fun binarySearch(
    numbs: List<Int>,
    numToSearch: Int,
): Int {
    var low = 0
    var height = numbs.size - 1
    while (low <= height) {
        val middle = (low + height) / 2
        val propose = numbs[middle]
        if (propose == numToSearch) {
            return middle
        }
        if (propose > numToSearch) {
            height = middle - 1
        } else {
            low = middle + 1
        }
    }
    return 0
}
