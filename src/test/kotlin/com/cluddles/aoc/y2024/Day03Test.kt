package com.cluddles.aoc.y2024

import com.cluddles.aoc.core.SolverInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day03Test {

    val solver = Day03

    val input = solver.prepareInput(SolverInput.fromPath(solver.examplePath))

    @Test fun part1() {
        assertThat(solver.solvePart1(input)).isEqualTo(161)
    }

    @Test fun part2() {
        assertThat(solver.solvePart2(input)).isEqualTo(48)
    }

}
