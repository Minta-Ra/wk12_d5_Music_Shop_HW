package partItems;

public class GuitarStrings extends PartItem {

    public GuitarStrings(String brand, double boughtPrice, double sellPrice, String material) {
        super(brand, boughtPrice, sellPrice, material);
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }

}
