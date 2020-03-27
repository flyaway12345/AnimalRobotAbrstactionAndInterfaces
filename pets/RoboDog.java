package myPackage.pets;

import myPackage.classifaction.ConsumerUse;
import myPackage.iPet;

public class RoboDog extends ConsumerUse implements iPet {
    public RoboDog(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Roll Up to the door and greet");
    }
    public void announceSerialNumber(){
        System.out.println("Model Type: 3573526683");
    };
}
