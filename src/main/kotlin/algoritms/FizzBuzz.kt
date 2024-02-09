package algoritms

fun main() {
    val result = fizzBuzz(15)
    print(result.toString())
}

fun fizzBuzz(n: Int): List<String> {
    val listResult = mutableListOf<String>()
    for (i in 1..n) {
        val dividedByTree = i.toDouble() / 3
        val dividedByFive = i.toDouble() / 5
        var result = ""
        if (dividedByTree % 1.0 == 0.0) {
            result = result.plus("Fizz")
        }
        if (dividedByFive % 1.0 == 0.0) {
            result = result.plus("Buzz")
        }
        if (result.isEmpty()) {
            result = result.plus("$i")
        }
        listResult.add(result)
    }
    return listResult
}
