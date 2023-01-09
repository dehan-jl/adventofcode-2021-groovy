class Day3 {
    static List<List<Integer>> readInput() {
        File file = new File("day3.txt")
        return file
                .readLines()
                .collect { it.chars().boxed().collect { it - 48 } }
    }

    static Integer parseToInt(List<Integer> bitList) {
        return bitList
                .collect { it.toString() }
                .inject { a, b -> a + b }
                .with { Integer.parseInt(it, 2) }
    }

    static def part1() {
        println "Day 3 Part 1"
        def len = readInput().size()
        def mostCommon = readInput()
                .transpose()
                .collect { List<Integer> it -> it.sum() }
                .collect { Integer it -> it >= len / 2 ? 1 : 0 }
        def leastCommon = mostCommon.collect { it ^ 1 }
        def gamma = parseToInt(mostCommon)
        def epsilon = parseToInt(leastCommon)

        println "$gamma, $epsilon : ${gamma * epsilon}"
    }

    static def part2() {
        println "Day 3 Part 2"
    }
}
