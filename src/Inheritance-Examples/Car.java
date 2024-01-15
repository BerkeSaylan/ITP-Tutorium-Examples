package de.tum.cit.ase;

import com.sun.jdi.PathSearchingVirtualMachine;

class Car extends Vehicle {
    private int numDoors;
    private String brand;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);

        this.numDoors = numDoors;
    }
    //explain how super is used

    @Override
    public void displayInfo() {
        System.out.println("Car");
    }

    @Override
    public int one() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + " numDoors= " + numDoors;
    }

    @Override
    public String getBrand() {
        return brand + " Berke ";
    }

    public void setSuperBrand(String brand) {
        super.brand = brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    public void carGo() {
        System.out.println("Car go");
    }
}
