package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a car rental record.
 */
public class RentalRecord {
    private String brand;
    private String model;
    private String licensePlate;
    private String customerName;
    private int rentalPeriodInDays;
    private double baseRentalPrice;
    private List<String> additionalFeatures;

    /**
     * Constructor to initialize a RentalRecord object.
     * @param brand The brand of the car.
     * @param model The model of the car.
     * @param licensePlate The license plate of the car.
     * @param customerName The name of the customer renting the car.
     * @param rentalPeriodInDays The rental period in days.
     * @param baseRentalPrice The base rental price of the car.
     */
    public RentalRecord(String brand, String model, String licensePlate, String customerName,
                        int rentalPeriodInDays, double baseRentalPrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.customerName = customerName;
        this.rentalPeriodInDays = rentalPeriodInDays;
        this.baseRentalPrice = baseRentalPrice;
        this.additionalFeatures = new ArrayList<>();
    }

    /**
     * Add additional feature to the car rental.
     * @param feature The additional feature to add.
     */
    public void addAdditionalFeature(String feature) {
        additionalFeatures.add(feature);
    }

    /**
     * Calculate the total rental price including additional features.
     * @return The total rental price.
     */
    public double calculateTotalRentalPrice() {
        double totalRentalPrice = baseRentalPrice * rentalPeriodInDays;
        for (String feature : additionalFeatures) {
            totalRentalPrice += getAdditionalFeaturePrice(feature) * rentalPeriodInDays;
        }
        return totalRentalPrice;
    }


    private double getAdditionalFeaturePrice(String feature) {
        switch (feature) {
            case "GPS":
                return 20;
            case "Leather Seats":
                return 30;
            case "Hybrid":
                return 10;
            default:
                return 0;
        }
    }


}