package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

class ListContainer<T> {             //What happens if we write T extends Vehicle instead
    private List<T> items;

    public ListContainer() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void main(String[] args) {
            // Using CarList
            CarsContainer carContainer = new CarsContainer();
            carContainer.addCar(new Car("Toyota", 2000, 4));
            carContainer.addCar(new Car("Honda", 2001, 4));

            // Using BusList
            BusContainer busContainer = new BusContainer();
            busContainer.addBus(new Bus("Mercedes", 2000, 12));
            busContainer.addBus(new Bus("Volvo", 2003, 14));

            // Using Generic ListContainer
            ListContainer<Car> carContainer2 = new ListContainer<>();
            carContainer2.addItem(new Car("Ford", 2004, 2));

            ListContainer<Bus> busContainer2 = new ListContainer<>();
            busContainer2.addItem(new Bus("Scania", 2011, 12));

            ListContainer<Integer> integers = new ListContainer<>();

            List<Car> cars = carContainer2.getItems();
            List<Bus> buses = busContainer2.getItems();
    }
}
