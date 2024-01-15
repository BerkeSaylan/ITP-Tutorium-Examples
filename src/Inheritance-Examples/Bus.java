package de.tum.cit.ase;

class Bus extends Vehicle {
    private int seatingCapacity;

    public String brand = "Berke";

    public Bus(String brand, int year, int seatingCapacity) {
        super(brand, year);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bus");
    }


    @Override
    public int one() {
        return 0;
    }


    @Override
    public String toString() {
        return super.toString() + " seatingCapacity= " + seatingCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }

    public void busGo(int x) {
        System.out.println(x);
    }

    public void busGo() {
        System.out.println("Bus go");
    }

}
