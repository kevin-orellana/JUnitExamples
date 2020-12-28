package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo {

    @RepeatedTest(5)
    public void simpleRepeatedTest() {
        assertTrue(0 < 5);
    }

    @RepeatedTest(name="{displayName} - {currentRepetition}/{totalRepetitions}",
            value = 5)
    @DisplayName("Repeated test")
    public void repeatedTestWithDisplayName() {
        assertTrue(0 < 5);
    }
}