package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenStart0Finish5ThenSum15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish0ThenSum0() {
        int start = 5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0FinishMinus5ThenSum0() {
        int start = 0;
        int finish = -5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5FinishMinus5ThenSumMinus5() {
        int start = -5;
        int finish = -5;
        int result = Counter.sum(start, finish);
        int expected = -5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5FinishMinus6ThenSum0() {
        int start = -5;
        int finish = -6;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5FinishMinus4ThenSumMinus9() {
        int start = -5;
        int finish = -4;
        int result = Counter.sum(start, finish);
        int expected = -9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5Finish0ThenSumMinus15() {
        int start = -5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = -15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10FinisMinus5ThenSum0() {
        int start = 10;
        int finish = -5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5Finis10ThenSum40() {
        int start = -5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5Finis5ThenSum5() {
        int start = 5;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}