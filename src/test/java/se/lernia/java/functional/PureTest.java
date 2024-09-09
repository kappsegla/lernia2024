package se.lernia.java.functional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class PureTest {

    @Test
    @DisplayName("Add method with params 3 and 5 should return 5 👌")
    void addTwoAndThreeReturnsFive() {
        var result = Pure.add(2,3);

        assertEquals(5, result, "Addition of 2 and 3 failed");
    }

    @Test
    @DisplayName("Greet with good morning before 12")
    void greetWithGoodMorningBefore12() {
        var time = LocalTime.of(11,59);

        var result = Pure.greeting("Martin", time);

        assertEquals("Good morning Martin", result, "Greeting failed");
    }



}
