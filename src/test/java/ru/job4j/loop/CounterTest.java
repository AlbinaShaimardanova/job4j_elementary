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

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinesFiveToOneThenMinesSix() {
        int start = -5;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = -6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinesFiveToMinesFiveThenZero() {
        int start = -5;
        int finish = -5;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}