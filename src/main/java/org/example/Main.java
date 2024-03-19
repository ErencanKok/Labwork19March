package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter vehicle type (luxury/economy): ");
        String vehicleType = scanner.nextLine();


        System.out.println("Enter rental period in days: ");
        int rentalPeriod = scanner.nextInt();
        scanner.nextLine();


        RentalRecord rentalRecord;
        if (vehicleType.equalsIgnoreCase("luxury")) {
            rentalRecord = new RentalRecord("Mercedes", "S-Class", "XYZ456",
                    "Alice Smith", rentalPeriod, 100);

            addAdditionalFeatures(scanner, rentalRecord);
        } else if (vehicleType.equalsIgnoreCase("economy")) {
            rentalRecord = new RentalRecord("Toyota", "Prius", "DEF789",
                    "Bob Johnson", rentalPeriod, 50);

            addAdditionalFeatures(scanner, rentalRecord);
        } else {
            System.out.println("Invalid vehicle type. Exiting program.");
            return;
        }


        double totalPrice = rentalRecord.calculateTotalRentalPrice();


        System.out.println("Total rental price: $" + totalPrice);

        scanner.close();
    }

    private static void addAdditionalFeatures(Scanner scanner, RentalRecord rentalRecord) {
        while (true) {
            System.out.println("Select additional feature (GPS/Leather Seats/Hybrid) or type 'done' to finish: ");
            String feature = scanner.nextLine();
            if (feature.equalsIgnoreCase("done")) {
                break;
            }
            rentalRecord.addAdditionalFeature(feature);
        }
    }
}