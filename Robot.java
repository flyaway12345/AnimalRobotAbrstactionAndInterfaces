package myPackage;

public abstract class Robot {
    private String name;
    protected Integer batteryCharge;
    public Robot(String name){
        this.name = name;    }
        public String getName(){
        return name;
    }
    public void announceSerialNumber(){
        System.out.println("Factory error:XXXXXXXX");
    };
}
