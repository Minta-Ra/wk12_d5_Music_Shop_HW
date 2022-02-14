package instruments;

public class Piano extends Instrument {

    private int pedals;
    private int keys;

    public Piano(String brand, double boughtPrice, double sellPrice, String type, String colour, String material, int pedals, int keys) {
        super(brand, boughtPrice, sellPrice, type, colour, material);
        this.pedals = pedals;
        this.keys = keys;
    }

    public int getNumOfPedals() {
        return pedals;
    }

    public int getNumOfKeys() {
        return keys;
    }

    public String playInstrument() {
        return "Tun tu-run tun";
    }

}
