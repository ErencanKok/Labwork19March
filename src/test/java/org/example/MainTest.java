package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMainWithEconomyCar() {

        String[] simulatedInput = {"economy", "7"};

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        Main.main(simulatedInput);


        String expectedOutput = "Enter vehicle type (luxury/economy): \n" +
                "Enter rental period in days: \n" +
                "Select additional feature (GPS/Leather Seats/Hybrid) or type 'done' to finish: \n" +
                "Total rental price: $420.0\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}