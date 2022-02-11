package partItems;

public abstract class PartItem {

    public String brand;
    private double boughtPrice;
    private double sellPrice;
    private String material;

    public PartItem(String brand, double boughtPrice, double sellPrice, String material) {
        this.brand = brand;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
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

    public String getMaterial() {
        return material;
    }

}