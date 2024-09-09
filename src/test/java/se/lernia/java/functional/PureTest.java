package se.lernia.java.functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PureTest {

    @Test
    @DisplayName("Add method with params 3 and 5 should return 5 👌")
    void addTwoAndThreeReturnsFive() {
        var result = Pure.add(2, 3);

        assertEquals(5, result, "Addition of 2 and 3 failed");
    }

    @Test
    @DisplayName("Greet with good morning before 12")
    void greetWithGoodMorningBefore12() {
        var time = LocalTime.of(11, 59);

        var result = Pure.greeting("Martin", time);

        assertEquals("Good morning Martin", result, "Greeting failed");
    }

    @Test
    @DisplayName("Greet with good afternoon after 12")
    void greetWithGoodAfternoonAfter12() {
        assertEquals("Good afternoon Martin", Pure.greeting("Martin", LocalTime.of(12, 0)));
    }

    @Test
    @DisplayName("Greet with good afternoon after 15")
    void greetWithGoodAfternoonAfter15() {
        assertThat(Pure.greeting("Kalle", LocalTime.of(15, 0)))
                .startsWith("Good")
                .contains("Kalle")
                .hasSizeLessThan(50);
    }

    @ParameterizedTest(name = "summing {0} and {1} should give {2}")
    @MethodSource("integersProvider")
    void shouldSumTwoIntegers(int x, int y, int expectedResult) {
        //when
        int result = Pure.add(x, y);
        //expect
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> integersProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(-1, 2, 1),
                Arguments.of(3, 0, 3));
    }
}
