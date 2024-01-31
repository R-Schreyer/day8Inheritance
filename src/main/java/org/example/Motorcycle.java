package org.example;

public class Motorcycle extends Vehicle{

    private String typeOfMotorcycle;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String typeOfMotorcycle) {
        super(manufacturer, model, yearOfManufacture);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    public String getTypeOfMotorcycle() {
        return typeOfMotorcycle;
    }

    public void setTypeOfMotorcycle(String typeOfMotorcycle) {
        this.typeOfMotorcycle = typeOfMotorcycle;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
        " manufacturer = " + getManufacturer() + '\'' +
                ", model = " + getModel() + '\'' +
                ", yearOfManufacture = " + getYearOfManufacture() +
                " typeOfMotorcycle = " + typeOfMotorcycle; }
    }

