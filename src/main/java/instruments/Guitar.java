package instruments;

public class Guitar extends Instrument {

    private int strings;
    private GuitarType guitarType;

    public Guitar(String brand, double boughtPrice, double sellPrice, String type, String colour, String material, int strings, GuitarType guitarType){
        super(brand, boughtPrice, sellPrice, type, colour, material);
        this.strings = strings;
        this.guitarType = guitarType;
    }

    public int getNumOfStrings(){
        return strings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String playInstrument(){
        return "a-woogah woogah";
    }

}
