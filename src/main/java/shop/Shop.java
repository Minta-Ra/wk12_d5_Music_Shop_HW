package shop;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getItemsFromStock() {
        return stock;
    }

    //     public int getItemsFromStock() {
    //     return stock.size();
    // }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }

    public double getTotalPotentialProfit() {
        double total = 0;
        for(ISell item : stock) {
            double result = item.calculateMarkup();
            total += result;
        }
        return total;
    }

}
