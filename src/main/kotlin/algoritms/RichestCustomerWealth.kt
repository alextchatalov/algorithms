package algoritms

fun main() {
    maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1)))
}
 fun maximumWealth (accounts: Array<IntArray>): Int {
     return accounts.map { it.sum() }.max()
 }
