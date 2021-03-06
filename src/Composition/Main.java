package Composition;

public class Main {

    //    psvm  sout

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "224", dimensions);

        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440) );
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.0");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(1500, 1200, "Red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getMotherboard().getBios();
        thePC.getTheCase().pressPowerButton();

    }

}
