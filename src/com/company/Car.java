package com.company;

public class Car extends Vehicle implements Comparable <Car> {
    private String mark;
    private String model;
    private int yearOfProduction;

    public Car(String mark, String model, int yearOfProduction) {
        this.mark = mark;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "The year of production of a car with mark " + mark + " and model " + model + " is " + yearOfProduction + ".";
    }

    @Override
    public int compareTo(Car c) {
        if(this.getYearOfProduction() > c.getYearOfProduction()){
            return 1;
        } else if (this.getYearOfProduction() < c.getYearOfProduction()){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void drive() {
        System.out.println("The vehicle can be driven.");
    }
}
