package se.lernia.java.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    void givenEmptyStringWhenCallingAddThenReturnZero() {
        int result = StringCalculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void givenStringWith1WhenCallingAddThenReturn1() {
        assertThat(StringCalculator.add("1")).isEqualTo(1);
    }

    @Test
    void givenStringWith2ValuesSeparatedByCommaWhenCallingAddThenReturnSum() {
        assertThat(StringCalculator.add("1,2")).isEqualTo(3);
    }

    @Test
    void givenStringWithMultipleValuesSeparatedByCommaAndNewLineCallingAddThenReturnSum() {
        assertThat(StringCalculator.add("1\n2,3")).isEqualTo(6);
    }

}
