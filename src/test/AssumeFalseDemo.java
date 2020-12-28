package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssumeFalseDemo {

    @Test
    void testOnDevelopmentEnvironment() {
        System.setProperty("ENV", "DEV");
        assumeFalse("DEV".equals(System.getProperty("ENV")), "Assumption failed");
        //remainder of test will be aborted
    }

    @Test
    void testOnProductionEnvironment() {
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV")));
        // remainder of test will proceed
    }
}