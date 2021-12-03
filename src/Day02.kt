fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    //val testInput = readInput("Day01_test")
    //check(part1(testInput) == 1)

    val input = readInput("Day02")

    var line: List<String>
    var x: Int = 0
    var y: Int = 0
    for (idx in input.indices) {
        line = input[idx].split(" ")
        when(line[0]) {
            "forward" -> x += line[1].toInt()
            "down" -> y += line[1].toInt()
            "up" -> y -= line[1].toInt()
        }
    }
    println("${x},${y} => ${x*y}")
    //Part-2
    var aim: Int = 0
    x = 0
    y = 0
    for (idx in input.indices) {
        line = input[idx].split(" ")
        when(line[0]) {
            "forward" -> {
                x += line[1].toInt()
                y += line[1].toInt() * aim
            }
            "down" -> aim += line[1].toInt()
            "up" -> aim -= line[1].toInt()
        }
    }
    println("${x},${y} => ${x*y}")
}
