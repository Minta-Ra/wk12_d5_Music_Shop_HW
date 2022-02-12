package instruments;

public class Saxophone extends Instrument {

    public Saxophone(String brand, double boughtPrice, double sellPrice, String type, String colour, String material) {
        super(brand, boughtPrice, sellPrice, type, colour, material);
    }

    public String playInstrument() {
        return "buhoomu-hoooooooom";
    }

    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }

}
