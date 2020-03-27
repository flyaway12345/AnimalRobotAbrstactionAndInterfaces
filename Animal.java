package myPackage;

public abstract class Animal {
    //instance variable || properties
    private String name;
    protected Integer numberOfLegs;    //Parameterized constructor
    public Animal(String name){
        this.name = name;    }    public String getName(){
        return name;
    }    //method
    public abstract void eat();}