package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();

        Car c1 = new Car();
        c1.setMark("Mercedes");
        c1.setModel("M1");
        c1.setYearOfProduction(2020);
        cars.add(c1);

        Car c2 = new Car();
        c2.setMark("Audi");
        c2.setModel("M2");
        c2.setYearOfProduction(2023);
        cars.add(c2);

        Car c3 = new Car();
        c3.setMark("BMW");
        c3.setModel("M3");
        c3.setYearOfProduction(2019);
        cars.add(c3);

        Car c4 = new Car();
        c4.setMark("Tesla");
        c4.setModel("M4");
        c4.setYearOfProduction(2021);
        cars.add(c4);

        Collections.sort(cars);
        for(Car currentCar : cars){
            System.out.println(currentCar.toString());
        }
    }
}
