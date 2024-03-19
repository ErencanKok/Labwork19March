package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalRecordTest {

    @Test
    public void testCalculateTotalRentalPrice() {
        RentalRecord rentalRecord = new RentalRecord("Toyota", "Camry", "ABC123",
                "John Doe", 3, 50);

        rentalRecord.addAdditionalFeature("GPS");
        rentalRecord.addAdditionalFeature("Leather Seats");

        double expectedTotalPrice = (50 + 20 + 30) * 3;
        assertEquals(expectedTotalPrice, rentalRecord.calculateTotalRentalPrice());
    }
}