package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.List;

public class BusContainer {
    private List<Bus> buses;

    public BusContainer() {
        this.buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> getBuses() {
        return buses;
    }
}
