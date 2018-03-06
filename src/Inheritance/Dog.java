package Inheritance;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Constructor
    public Dog(String name, int size, int weight, int eyes, int legs) {
        // Call the animal's properties
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
    }

    private void  chew(){
        System.out.println("Dog Chew Called Private");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("The dog eat method was overrided");
    }

}
