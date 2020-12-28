package test;

import BusinessLogic.OddEven;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OddEvenTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    void givenANumber_whenIsEvenIsCalled_thenTrueIsReturnedForEvenNumbers(int number) {
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(number));
    }

}
