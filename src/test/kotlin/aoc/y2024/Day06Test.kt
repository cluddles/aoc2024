package aoc.y2024

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day06Test {

    val solver = Day06

    val input = solver.prepareInput("2024/tests/day06")

    @Test fun part1() {
        assertThat(solver.solvePart1(input)).isEqualTo(41)
    }

    @Test fun part2() {
        assertThat(solver.solvePart2(input)).isEqualTo(6)
    }

}
