class Day1 {
    static List<Integer> readInput() {
        File file = new File("day1.txt")
        return file.readLines().collect {Integer.valueOf(it)}
    }

    static def part1() {
        println "Day 1 Part 1"
        println readInput()
                .collate(2, 1, false)
                .collect {it.last() > it.first()}
                .findAll {it}
                .size()
    }

    static def part2() {
        println "Day 1 Part 2"
        println readInput()
                .collate(3, 1, false)
                .collect {it.sum()}
                .collate(2, 1, false)
                .collect {it.last() > it.first()}
                .findAll {it}
                .size()
    }
}
