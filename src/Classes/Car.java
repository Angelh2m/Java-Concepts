package Classes;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){

        String validModel = model.toLowerCase();
        if (validModel.equals("porsche")){
            this.model = model;
            System.out.printf("This car is a " + this.model);
        }
    }
}
