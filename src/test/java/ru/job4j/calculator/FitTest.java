package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {
    @Test
    void whenManHeight187ThenWeight99Point35() {
        int height = 187;
        int adjustment = 100;
        double expected = 100.05;
        double result = Fit.calculateWeight(height, adjustment);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight166ThenWeight64Point4() {
        int height = 166;
        int adjustment = 110;
        double expected = 64.4;
        double result = Fit.calculateWeight(height, adjustment);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenHeight150AndAdjustment100ThenWeight57Point5() {
        int height = 150;
        int adjustment = 100;
        double expected = 57.5;
        double result = Fit.calculateWeight(height, adjustment);
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenNegativeHeightThenThrowException() {
        int height = -10;
        int adjustment = 100;
        assertThatThrownBy(() -> Fit.calculateWeight(height, adjustment))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than 0");
    }
}