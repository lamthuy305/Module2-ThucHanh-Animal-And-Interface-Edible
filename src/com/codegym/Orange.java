package com.codegym;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "bóc vỏ, " + super.howToEat();
    }

    @Override
    public String toString() {
        return "Qủa cam: " + howToEat();
    }
}
