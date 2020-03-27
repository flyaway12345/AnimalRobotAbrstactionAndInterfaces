package myPackage.pets;

import myPackage.classifaction.Reptile;
import myPackage.iPet;

public class beardedDragon extends Reptile implements iPet {
    public beardedDragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("beardedDargons Eat Worms");
    }

    @Override
    public void greet() {
        System.out.println("climbs on sholder and curls");
    }
}
