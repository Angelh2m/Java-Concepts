package Composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    //    Composition == Using another class as a part of your existing class
    //    Monitor has a resolution therefore is a monitor as a whole
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing a pixel at " +  x  +  " , " + y + " color " + color );
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
