package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class CarsContainer {
        private List<Car> cars;

        public CarsContainer() {
            this.cars = new ArrayList<>();
        }

        public void addCar(Car car) {
            cars.add(car);
        }

        public List<Car> getCars() {
            return cars;
        }
}
