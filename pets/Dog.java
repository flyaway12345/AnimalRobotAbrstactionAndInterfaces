package myPackage.pets;

import myPackage.classifaction.Canine;
import myPackage.iPet;

public class Dog extends Canine implements iPet {
    public Dog(String name) {
    super(name);
}
@Override
public void eat() {
    System.out.println("dogs eat bones");
}

    @Override
    public void greet() {
        System.out.println("Jump and lick");
    }
}