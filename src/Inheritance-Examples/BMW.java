package de.tum.cit.ase;

public class BMW extends Car{
    public BMW(String brand, int year, int numDoors) {
        super(brand, year, numDoors);
    }


    public void start() {
        System.out.println("BMW starts");
    }
}
