package partItems;

public class SaxophoneStand extends PartItem {

    public SaxophoneStand(String brand, double boughtPrice, double sellPrice, String material) {
        super(brand, boughtPrice, sellPrice, material);
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }

}
