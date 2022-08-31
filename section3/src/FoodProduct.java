import java.util.Date;

public class FoodProduct extends Product {
    Date productionDate;
    int life;

    FoodProduct(String sku, String description, double price, double tax, Location location, Date productionDate, int life) {
        super(sku, description, price, tax, location);
        this.productionDate = productionDate;
        this.life = life;
    }
}
