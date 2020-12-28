package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({ "one, 1", "two, 2", "'foo, bar', 3" })
    void testWithCsvSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "../resources/capitals.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String country, String capital) {
        System.out.println("Country " + country + " capital " + capital);
        assertNotNull(country);
        assertNotNull(capital);
    }

}