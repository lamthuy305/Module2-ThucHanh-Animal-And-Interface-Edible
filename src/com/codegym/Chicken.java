package com.codegym;

public class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "luộc";
    }
    @Override
    public String toString() {
        return "Chicken";
    }

    @Override
    public String makeSound() {
        return "Chicken: chick chick !!!";
    }
}
