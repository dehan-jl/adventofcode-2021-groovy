class Day2 {
    static List<Tuple> readInput() {
        File file = new File("day2.txt")
        return file
                .readLines()
                .collect {it.split(" ")}
                .collect { new Tuple(it.first(), Integer.valueOf(it.last()))}
    }

    static def part1() {
        println "Day 1 Part 1"
        def x = 0
        def d = 0
        readInput().each {
            switch (it.first()) {
                case "forward":
                    x += it.last()
                    break
                case "up":
                    d -= it.last()
                    break
                case "down":
                    d += it.last()
                    break
            }
        }

        println "$x, $d, ${x*d}"
    }

    static def part2() {
        println "Day 1 Part 2"
        def x = 0
        def d = 0
        def aim = 0
        readInput().each {
            switch (it.first()) {
                case "forward":
                    x += it.last()
                    d += aim * (Integer) it.last()
                    break
                case "up":
                    aim -= it.last()
                    break
                case "down":
                    aim += it.last()
                    break
            }
        }

        println "$x, $d, $aim, ${x*d}"
    }
}
