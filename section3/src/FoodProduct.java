import java.util.Date;

public class FoodProduct extends Product implements Locatable,Priceable{
    Date productionDate;
    int life;

    FoodProduct(String sku, String description, double price, double tax, Date productionDate, int life) {
        super(sku, description);
        this.productionDate = productionDate;
        this.life = life;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getTax() {
        return 0;
    }

    @Override
    public String getDepot() {
        return null;
    }

    @Override
    public String getPlace() {
        return null;
    }

    @Override
    public void purchase() {

    }

    @Override
    public void pay() {

    }
}
