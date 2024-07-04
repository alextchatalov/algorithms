package algoritms.hashmap

// Leetcode 383. Ransom Node: https://leetcode.com/problems/ransom-note/submissions/1309332153/
fun main() {
    val result = canConstruct("aab", "baa")
    println(result)
}

fun canConstruct(
    ransomNote: String,
    magazine: String,
): Boolean {
    val map = mutableMapOf<Char, Int>()
    for (c in magazine) {
        map[c] = map.getOrDefault(c, 0) + 1
    }
    for (c in ransomNote) {
        if (map.getOrDefault(c, 0) == 0) {
            return false
        }
        map[c] = map[c]!! - 1
    }
    return true
}
