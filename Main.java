package myPackage;

import myPackage.pets.Cat;
import myPackage.pets.Dog;
import myPackage.pets.RoboDog;

public class Main {
    public static void main(String[] args) {        //newGingerBreadAnimal.name = "mikaila";
        Dog dog1 = new Dog("fido");
        dog1.numberOfLegs = 4;
        dog1.eat();
        dog1.greet();
        Cat cat1 = new Cat("felix");
        System.out.println(cat1.numberOfLegs = 3);

        RoboDog roboDog = new RoboDog("bleep");
        roboDog.greet();
        roboDog.announceSerialNumber();
        System.out.println((roboDog.batteryCharge = 58) + "%");
    }
}