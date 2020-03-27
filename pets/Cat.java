package myPackage.pets;

import myPackage.classifaction.Feline;
import myPackage.iPet;

public class Cat extends Feline implements iPet {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("cat eat tuna");
    }

    @Override
    public void greet() {
        System.out.println("nuzzles & Purrs");
    }
}