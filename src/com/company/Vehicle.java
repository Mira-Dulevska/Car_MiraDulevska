package com.company;

public abstract class Vehicle {
    private boolean isActive;

    public Vehicle(boolean isActive) {
        this.isActive = isActive;
    }

    public Vehicle() {
        isActive = true;
    }

    public abstract void drive();
}
