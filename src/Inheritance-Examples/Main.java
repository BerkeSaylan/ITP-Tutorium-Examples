package de.tum.cit.ase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bus("Mercedes", 2014, 14);
        v = new Car("Mercedees", 2014, 14);

        //Static polymorphism
        Bus bus1 = new Bus("Mercedees", 2014, 14);
        bus1.busGo();
        bus1.busGo(1);

        //Dynamic polymorphism
        Vehicle car2 = new Car("A", 2019, 4);
        car2.start();  // Calls Car's start method


        Vehicle bus2 = new Bus("A", 2011, 10);
        bus2.start();  // Calls Bus's start method

        Vehicle veh = new Car("A", 2019, 4);
        veh = new Bus("A", 2011, 10);
        veh.start();


        Displayable car3 = new Car("B", 2019, 4);
        car3.displayInfo();
        //car3.start() doesn't work why?

        Vehicle car4 = new Car("C", 2018, 2);
        //Would car4.start() work, if yes from which class would it be called (Vehicle/Car?)

        Vehicle car5 = new BMW("D", 2018, 2);
        //From which class would car5.start() call (Vehicle/Car/BMW)?

        /* Rule: To see which method we should actually call in the end, we start from the
        class of the static type, if the class of the static type of the object doesnt have
        the method, then we cant call the method at all or we need type-casting for that.
        If we find the method in the class of the static type we go down in the inheritance hierarchy
        searching for the method in the subclasses, we either stop if we cant find the method anymore
        or we stop if we reach the class of the dynamic type.

         */



        Car car1 = new Car("BMW", 2014, 4);
        Vehicle vehicle = (Vehicle) car1;
        /* Static type of car: Car
            Dynamic type of car: Car
            Static type of vehicle: Vehicle
            Dynamic type of vehicle: Car


            Casting from a subclass to a superclass is called upcasting.
            Typically, the upcasting is implicitly performed by the compiler.
            Upcasting is closely related to inheritance — another core concept in Java.
            And every time we do this, implicit upcasting takes place.
            Limits capabilities of the vehicle Object by upcasting


            */



        Vehicle vehicle2 = new Bus("C", 2000, 7);
        ((Bus) vehicle2).busGo();

        //Safer way to do:
        if(vehicle2 instanceof Bus) {
            ((Bus) vehicle2).busGo();
        }

        /*instanceof checks for the dynamic type, type-casting changes the static type temporarily
        so that the method can be called on the object or that the dynamic type of the object can be
        assigned as the dynamic type of another object
         */


        //Even easier:
        if(vehicle2 instanceof Bus x) {
            x.busGo();
        }



        /* What if we want to use the variable of type Vehicle to invoke a method available only to Bus class?
        Here comes the downcasting. It’s the casting from a superclass to a subclass.



         */





        //Possible use case for Interfaces
        List<Displayable> displayables = new ArrayList<>();
        displayables.add(new Car("A", 2011, 4));
        displayables.add(new Bus("B", 2005, 16));
        displayables.add(new Vehicle("C", 2005));
        displayables.add(new House());

        for (Displayable d : displayables) {
            d.displayInfo();  // Calls the appropriate displayInfo method
        }


        for(Displayable d : displayables) {
            if (d instanceof Car) {
                ((Car) d).carGo();
            } else if (d instanceof Bus) {
                ((Bus) d).busGo();
            } else if (d instanceof Vehicle) {
                ((Vehicle) d).vehicleGoGo();
            } else if (d instanceof House) {
                ((House) d).displayInfo();
            }
        }
    }
}
