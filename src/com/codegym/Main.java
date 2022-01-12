package com.codegym;

import com.codegym.Animal;
import com.codegym.Chicken;
import com.codegym.Tiger;
import com.codegym.Edible;


public class Main {

    public static void main(String[] args) {
        Animal chicken = new Chicken();
        Animal tiger = new Tiger();
        Fruit orange = new Orange();
        Fruit apple = new Apple();

        System.out.println(chicken);
        System.out.println(chicken.makeSound());
        System.out.println(tiger);
        System.out.println(tiger.makeSound());
        System.out.printf("chicken instanceof Edible: %b\n", chicken instanceof Edible);
        System.out.printf("chicken instanceof Animal: %b\n", chicken instanceof Animal);
        System.out.printf("tiger instanceof Edible: %b\n", tiger instanceof Edible);
        System.out.printf("tiger instanceof Animal: %b\n", tiger instanceof Animal);
        System.out.println();

        System.out.println(orange);
        System.out.println(apple);
        System.out.printf("orange instanceof Edible: %b\n", orange instanceof Edible);
        System.out.printf("orange instanceof Fruit: %b\n", orange instanceof Fruit);
        System.out.println();
    }
}
