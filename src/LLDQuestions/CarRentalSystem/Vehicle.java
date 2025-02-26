package src.LLDQuestions.CarRentalSystem;

public class Vehicle {
    private final String company;
    private final String model;
    private final int year;
    private final String licensePlate;
    private final double rentalPricePerDay;
    private boolean available;

    public Vehicle(String company, String model, int year, String licensePlate, double rentalPricePerDay) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.licensePlate = licensePlate;
        this.rentalPricePerDay = rentalPricePerDay;
        this.available = true;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}
