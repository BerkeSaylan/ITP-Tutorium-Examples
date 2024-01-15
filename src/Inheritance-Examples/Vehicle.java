package de.tum.cit.ase;

class Vehicle implements Honkable, Displayable{

    //Explain abstract, non-abstract classes

    protected String brand;
    protected int year;
    //Explain the difference between protected and private

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void honk() {
        System.out.println("Vehicle honk!");
    }

    @Override
    public int one() {
        return 0;
    }

    public String brandName() {
        return "Name of the brand is: " + brandName();
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\n' +
                ", year=" + year;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void vehicleGoGo() {
        System.out.println("Vehicle go go");
    }
















    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void displayInfo() {

    }
}

