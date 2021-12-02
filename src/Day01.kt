fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
//    println(part1(input))
//    println(part2(input))
    //Part-1
    var count = 0
    var curr: Int
    var prev: Int = input[0].toInt()
    for (idx in input.indices) {
        curr = input[idx].toInt()
        if (idx > 0 && curr > prev) {
            count++
        }
        prev = curr
    }
    println(count)
    //Part-2 3-measurement sliding window
    count = 0
    for (idx in 0..input.size - 3) {
        curr = input[idx].toInt() + input[idx + 1].toInt() + input[idx + 2].toInt()
        if (idx > 0 && curr > prev) {
            count++
        }
        prev = curr
    }
    println(count)
}
