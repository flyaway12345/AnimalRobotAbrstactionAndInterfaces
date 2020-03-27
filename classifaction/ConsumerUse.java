package myPackage.classifaction;

import myPackage.Robot;

public abstract class ConsumerUse extends Robot {

    public ConsumerUse(String name) {
        super(name);
    }

    @Override
    public void announceSerialNumber() {
        System.out.println("Subsection: 2324539393");
    }
}
