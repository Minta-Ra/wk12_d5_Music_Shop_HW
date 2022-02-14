package instruments;

public class Trumpet extends Instrument {

    private int valves;

    public Trumpet(String brand, double boughtPrice, double sellPrice, String type, String colour, String material, int valves) {
        super(brand, boughtPrice, sellPrice, type, colour, material);
        this.valves = valves;
    }

    public int getNumOfValves() {
        return valves;
    }

    public String playInstrument() {
        return "Buuuuup";
    }

}
