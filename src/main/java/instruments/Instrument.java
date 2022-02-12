package instruments;

import shop.ISell;

// implement when I want to be that thing
public abstract class Instrument implements IPlay, ISell {

    // I want to have that thing
    // private IPlay play

    private String brand;
    private double boughtPrice;
    private double sellPrice;
    private String type;
    private String colour;
    private String material;

    public Instrument(String brand, double boughtPrice, double sellPrice, String type, String colour, String material) {
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.type = type;
        this.colour = colour;
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

}
