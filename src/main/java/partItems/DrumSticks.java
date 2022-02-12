package partItems;

public class DrumSticks extends PartItem {

    public DrumSticks(String brand, double boughtPrice, double sellPrice, String material) {
        super(brand, boughtPrice, sellPrice, material);
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }

}
