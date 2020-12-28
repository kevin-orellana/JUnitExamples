package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class AssumingThatDemo {

    @Test
    void testInAllEnvironments() {
        System.setProperty("ENV", "DEV");
        assumingThat("DEV".equals(System.getProperty("ENV")),
                () -> {
                    // perform these assertions only on the Dev server
                    System.out.println("Perform these assertions only on the Dev server !!!");
                    assertEquals(2, 1 + 1);
                });

        // perform these assertions in all environments
        assertEquals(42, 40 + 2);
    }

    @Test
    void testInAllEnvironments2() {
        System.setProperty("ENV", "DEV");
        assumingThat("PROD".equals(System.getProperty("ENV")),
                () -> {
                    // perform these assertions only on the Prod server
                    System.out.println("Perform these assertions only on the Prod server !!!");
                    assertEquals(2, 1 + 1);
                });

        // perform these assertions in all environments
        assertEquals(42, 40 + 2);
        Callable<String> c = new Callable<String>(){
            @Override
            public String call() throws Exception {
                return "null";
            }
        };
        try {
            String result = c.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}